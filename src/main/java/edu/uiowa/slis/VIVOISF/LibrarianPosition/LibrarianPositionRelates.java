package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (LibrarianPositionRelatesIterator)findAncestorWithClass(this, LibrarianPositionRelatesIterator.class);
			pageContext.getOut().print(theLibrarianPositionRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

