package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListARIterator theLibrarianPosition = (LibrarianPositionNameListARIterator)findAncestorWithClass(this, LibrarianPositionNameListARIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

