package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialITIterator theLibrarianPosition = (LibrarianPositionNameOfficialITIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialITIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

