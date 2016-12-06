package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleHDINotesIterator theArticle = (ArticleHDINotesIterator)findAncestorWithClass(this, ArticleHDINotesIterator.class);
			pageContext.getOut().print(theArticle.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

