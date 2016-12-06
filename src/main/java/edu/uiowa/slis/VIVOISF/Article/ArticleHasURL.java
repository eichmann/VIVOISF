package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ArticleHasURLIterator theArticleHasURLIterator = (ArticleHasURLIterator)findAncestorWithClass(this, ArticleHasURLIterator.class);
			pageContext.getOut().print(theArticleHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

