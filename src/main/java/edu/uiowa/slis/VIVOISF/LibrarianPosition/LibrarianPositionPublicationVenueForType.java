package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPublicationVenueForIterator theLibrarianPositionPublicationVenueForIterator = (LibrarianPositionPublicationVenueForIterator)findAncestorWithClass(this, LibrarianPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theLibrarianPositionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

