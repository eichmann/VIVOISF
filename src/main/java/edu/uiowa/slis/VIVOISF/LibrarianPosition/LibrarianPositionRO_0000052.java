package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRO_0000052Iterator theLibrarianPositionRO_0000052Iterator = (LibrarianPositionRO_0000052Iterator)findAncestorWithClass(this, LibrarianPositionRO_0000052Iterator.class);
			pageContext.getOut().print(theLibrarianPositionRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

