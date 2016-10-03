package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianOrganizerInverseIterator theLibrarianOrganizerInverseIterator = (LibrarianOrganizerInverseIterator)findAncestorWithClass(this, LibrarianOrganizerInverseIterator.class);
			pageContext.getOut().print(theLibrarianOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for organizer tag ");
		}
		return SKIP_BODY;
	}
}
