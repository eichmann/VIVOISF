package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleUpcIterator theArticle = (ArticleUpcIterator)findAncestorWithClass(this, ArticleUpcIterator.class);
			pageContext.getOut().print(theArticle.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for upc tag ");
		}
		return SKIP_BODY;
	}
}

