package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleNumPagesIterator theArticle = (ArticleNumPagesIterator)findAncestorWithClass(this, ArticleNumPagesIterator.class);
			pageContext.getOut().print(theArticle.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for numPages tag ");
		}
		return SKIP_BODY;
	}
}

