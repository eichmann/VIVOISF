package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortITIterator theLibrarianPosition = (LibrarianPositionNameShortITIterator)findAncestorWithClass(this, LibrarianPositionNameShortITIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

