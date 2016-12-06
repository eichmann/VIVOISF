package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRO_0001015Iterator theLibrarianPositionRO_0001015Iterator = (LibrarianPositionRO_0001015Iterator)findAncestorWithClass(this, LibrarianPositionRO_0001015Iterator.class);
			pageContext.getOut().print(theLibrarianPositionRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

