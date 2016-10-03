package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleShortTitleIterator theArticle = (ArticleShortTitleIterator)findAncestorWithClass(this, ArticleShortTitleIterator.class);
			pageContext.getOut().print(theArticle.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

