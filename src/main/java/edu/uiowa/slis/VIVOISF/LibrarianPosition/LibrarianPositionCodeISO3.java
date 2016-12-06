package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeISO3Iterator theLibrarianPosition = (LibrarianPositionCodeISO3Iterator)findAncestorWithClass(this, LibrarianPositionCodeISO3Iterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

