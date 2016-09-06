package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasPublicationVenueIterator theBookHasPublicationVenueIterator = (BookHasPublicationVenueIterator)findAncestorWithClass(this, BookHasPublicationVenueIterator.class);
			pageContext.getOut().print(theBookHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

