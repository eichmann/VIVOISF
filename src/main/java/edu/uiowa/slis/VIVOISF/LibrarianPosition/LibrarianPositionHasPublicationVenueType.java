package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasPublicationVenueIterator theLibrarianPositionHasPublicationVenueIterator = (LibrarianPositionHasPublicationVenueIterator)findAncestorWithClass(this, LibrarianPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

