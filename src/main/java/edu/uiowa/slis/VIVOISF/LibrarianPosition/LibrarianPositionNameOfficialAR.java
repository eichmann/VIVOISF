package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialARIterator theLibrarianPosition = (LibrarianPositionNameOfficialARIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialARIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

