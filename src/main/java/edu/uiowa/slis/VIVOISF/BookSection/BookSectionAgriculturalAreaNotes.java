package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionAgriculturalAreaNotesIterator theBookSection = (BookSectionAgriculturalAreaNotesIterator)findAncestorWithClass(this, BookSectionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theBookSection.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

