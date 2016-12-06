package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListZHIterator theLibrarianPosition = (LibrarianPositionNameListZHIterator)findAncestorWithClass(this, LibrarianPositionNameListZHIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

