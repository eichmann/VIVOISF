package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePageEndIterator theArticle = (ArticlePageEndIterator)findAncestorWithClass(this, ArticlePageEndIterator.class);
			pageContext.getOut().print(theArticle.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

