package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleDescriptionIterator theArticle = (ArticleDescriptionIterator)findAncestorWithClass(this, ArticleDescriptionIterator.class);
			pageContext.getOut().print(theArticle.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for description tag ");
		}
		return SKIP_BODY;
	}
}

