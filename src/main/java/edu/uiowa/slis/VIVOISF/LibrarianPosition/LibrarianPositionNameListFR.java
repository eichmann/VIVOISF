package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListFRIterator theLibrarianPosition = (LibrarianPositionNameListFRIterator)findAncestorWithClass(this, LibrarianPositionNameListFRIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

