package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticlePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticlePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticlePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticlePageStartIterator theArticle = (ArticlePageStartIterator)findAncestorWithClass(this, ArticlePageStartIterator.class);
			pageContext.getOut().print(theArticle.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

