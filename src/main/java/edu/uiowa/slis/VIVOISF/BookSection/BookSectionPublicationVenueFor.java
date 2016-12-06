package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionPublicationVenueForIterator theBookSectionPublicationVenueForIterator = (BookSectionPublicationVenueForIterator)findAncestorWithClass(this, BookSectionPublicationVenueForIterator.class);
			pageContext.getOut().print(theBookSectionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

