package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLandAreaNotesIterator theBookSection = (BookSectionLandAreaNotesIterator)findAncestorWithClass(this, BookSectionLandAreaNotesIterator.class);
			pageContext.getOut().print(theBookSection.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

