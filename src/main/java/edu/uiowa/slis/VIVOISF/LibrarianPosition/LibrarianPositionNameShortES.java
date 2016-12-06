package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortESIterator theLibrarianPosition = (LibrarianPositionNameShortESIterator)findAncestorWithClass(this, LibrarianPositionNameShortESIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

