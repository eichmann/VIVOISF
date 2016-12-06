package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionBFO_0000051Iterator theLibrarianPositionBFO_0000051Iterator = (LibrarianPositionBFO_0000051Iterator)findAncestorWithClass(this, LibrarianPositionBFO_0000051Iterator.class);
			pageContext.getOut().print(theLibrarianPositionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

