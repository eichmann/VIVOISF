package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleGDPNotesIterator theArticle = (ArticleGDPNotesIterator)findAncestorWithClass(this, ArticleGDPNotesIterator.class);
			pageContext.getOut().print(theArticle.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

