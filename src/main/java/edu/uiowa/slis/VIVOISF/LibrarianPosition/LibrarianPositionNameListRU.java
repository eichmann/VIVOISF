package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListRUIterator theLibrarianPosition = (LibrarianPositionNameListRUIterator)findAncestorWithClass(this, LibrarianPositionNameListRUIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

