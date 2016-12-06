package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortZHIterator theLibrarianPosition = (LibrarianPositionNameShortZHIterator)findAncestorWithClass(this, LibrarianPositionNameShortZHIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

