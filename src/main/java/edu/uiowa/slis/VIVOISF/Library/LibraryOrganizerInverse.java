package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryOrganizerInverseIterator theLibraryOrganizerInverseIterator = (LibraryOrganizerInverseIterator)findAncestorWithClass(this, LibraryOrganizerInverseIterator.class);
			pageContext.getOut().print(theLibraryOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for organizer tag ");
		}
		return SKIP_BODY;
	}
}

