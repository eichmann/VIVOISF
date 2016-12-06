package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialZHIterator theLibrarianPosition = (LibrarianPositionNameOfficialZHIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

