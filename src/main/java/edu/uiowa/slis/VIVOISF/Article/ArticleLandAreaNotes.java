package edu.uiowa.slis.VIVOISF.Article;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ArticleLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ArticleLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ArticleLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ArticleLandAreaNotesIterator theArticle = (ArticleLandAreaNotesIterator)findAncestorWithClass(this, ArticleLandAreaNotesIterator.class);
			pageContext.getOut().print(theArticle.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Article for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Article for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

