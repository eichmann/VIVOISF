package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleCodenIterator theArticle = (ArticleCodenIterator)findAncestorWithClass(this, ArticleCodenIterator.class);
			pageContext.getOut().print(theArticle.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for coden tag ");
		}
		return SKIP_BODY;
	}
}

