package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleGeographicFocusIterator theArticleGeographicFocusIterator = (ArticleGeographicFocusIterator)findAncestorWithClass(this, ArticleGeographicFocusIterator.class);
			pageContext.getOut().print(theArticleGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

