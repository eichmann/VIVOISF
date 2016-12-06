package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionGDPNotesIterator theBookSection = (BookSectionGDPNotesIterator)findAncestorWithClass(this, BookSectionGDPNotesIterator.class);
			pageContext.getOut().print(theBookSection.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

