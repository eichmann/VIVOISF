package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasEmailIterator theArticleHasEmailIterator = (ArticleHasEmailIterator)findAncestorWithClass(this, ArticleHasEmailIterator.class);
			pageContext.getOut().print(theArticleHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

