package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialRUIterator theLibrarianPosition = (LibrarianPositionNameOfficialRUIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialRUIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

