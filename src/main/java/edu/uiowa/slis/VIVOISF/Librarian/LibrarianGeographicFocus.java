package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianGeographicFocusIterator theLibrarianGeographicFocusIterator = (LibrarianGeographicFocusIterator)findAncestorWithClass(this, LibrarianGeographicFocusIterator.class);
			pageContext.getOut().print(theLibrarianGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

