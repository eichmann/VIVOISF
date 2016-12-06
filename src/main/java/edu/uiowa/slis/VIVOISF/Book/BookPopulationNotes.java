package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookPopulationNotesIterator theBook = (BookPopulationNotesIterator)findAncestorWithClass(this, BookPopulationNotesIterator.class);
			pageContext.getOut().print(theBook.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

