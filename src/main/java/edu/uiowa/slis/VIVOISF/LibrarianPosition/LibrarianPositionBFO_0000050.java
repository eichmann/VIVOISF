package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionBFO_0000050Iterator theLibrarianPositionBFO_0000050Iterator = (LibrarianPositionBFO_0000050Iterator)findAncestorWithClass(this, LibrarianPositionBFO_0000050Iterator.class);
			pageContext.getOut().print(theLibrarianPositionBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

