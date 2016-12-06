package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasAddressIterator theLibrarianPositionHasAddressIterator = (LibrarianPositionHasAddressIterator)findAncestorWithClass(this, LibrarianPositionHasAddressIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

