package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialFRIterator theLibrarianPosition = (LibrarianPositionNameOfficialFRIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialFRIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

