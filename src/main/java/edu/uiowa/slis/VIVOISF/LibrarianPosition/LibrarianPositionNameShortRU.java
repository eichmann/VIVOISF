package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameShortRUIterator theLibrarianPosition = (LibrarianPositionNameShortRUIterator)findAncestorWithClass(this, LibrarianPositionNameShortRUIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

