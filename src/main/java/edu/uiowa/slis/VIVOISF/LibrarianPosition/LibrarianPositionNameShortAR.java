package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortARIterator theLibrarianPosition = (LibrarianPositionNameShortARIterator)findAncestorWithClass(this, LibrarianPositionNameShortARIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

