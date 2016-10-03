package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleAsinIterator theArticle = (ArticleAsinIterator)findAncestorWithClass(this, ArticleAsinIterator.class);
			pageContext.getOut().print(theArticle.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for asin tag ");
		}
		return SKIP_BODY;
	}
}

