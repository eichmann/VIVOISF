package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleLocatorIterator theArticle = (ArticleLocatorIterator)findAncestorWithClass(this, ArticleLocatorIterator.class);
			pageContext.getOut().print(theArticle.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for locator tag ");
		}
		return SKIP_BODY;
	}
}

