package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleUrlIterator theArticle = (ArticleUrlIterator)findAncestorWithClass(this, ArticleUrlIterator.class);
			pageContext.getOut().print(theArticle.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for url tag ");
		}
		return SKIP_BODY;
	}
}

