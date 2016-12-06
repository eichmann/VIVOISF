package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRO_0002353Iterator theLibrarianPositionRO_0002353Iterator = (LibrarianPositionRO_0002353Iterator)findAncestorWithClass(this, LibrarianPositionRO_0002353Iterator.class);
			pageContext.getOut().print(theLibrarianPositionRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

