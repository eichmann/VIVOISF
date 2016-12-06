package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCountryAreaNotesIterator theBookSection = (BookSectionCountryAreaNotesIterator)findAncestorWithClass(this, BookSectionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theBookSection.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

