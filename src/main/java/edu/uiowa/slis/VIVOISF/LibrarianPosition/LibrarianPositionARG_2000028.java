package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionARG_2000028Iterator theLibrarianPositionARG_2000028Iterator = (LibrarianPositionARG_2000028Iterator)findAncestorWithClass(this, LibrarianPositionARG_2000028Iterator.class);
			pageContext.getOut().print(theLibrarianPositionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

