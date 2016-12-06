package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListESIterator theLibrarianPosition = (LibrarianPositionNameListESIterator)findAncestorWithClass(this, LibrarianPositionNameListESIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

