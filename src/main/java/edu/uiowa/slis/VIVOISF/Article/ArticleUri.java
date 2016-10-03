package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleUriIterator theArticle = (ArticleUriIterator)findAncestorWithClass(this, ArticleUriIterator.class);
			pageContext.getOut().print(theArticle.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for uri tag ");
		}
		return SKIP_BODY;
	}
}

