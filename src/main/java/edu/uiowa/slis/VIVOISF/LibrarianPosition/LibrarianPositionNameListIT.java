package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListITIterator theLibrarianPosition = (LibrarianPositionNameListITIterator)findAncestorWithClass(this, LibrarianPositionNameListITIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

