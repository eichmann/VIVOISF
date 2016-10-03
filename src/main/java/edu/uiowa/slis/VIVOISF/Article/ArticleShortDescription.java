package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleShortDescriptionIterator theArticle = (ArticleShortDescriptionIterator)findAncestorWithClass(this, ArticleShortDescriptionIterator.class);
			pageContext.getOut().print(theArticle.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

