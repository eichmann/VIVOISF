package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (LibrarianPositionRelatesIterator)findAncestorWithClass(this, LibrarianPositionRelatesIterator.class);
			pageContext.getOut().print(theLibrarianPositionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

