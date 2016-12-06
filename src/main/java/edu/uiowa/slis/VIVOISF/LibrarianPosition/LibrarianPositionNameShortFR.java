package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortFRIterator theLibrarianPosition = (LibrarianPositionNameShortFRIterator)findAncestorWithClass(this, LibrarianPositionNameShortFRIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

