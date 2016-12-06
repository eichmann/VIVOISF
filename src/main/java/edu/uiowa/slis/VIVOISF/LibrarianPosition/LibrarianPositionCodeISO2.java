package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeISO2Iterator theLibrarianPosition = (LibrarianPositionCodeISO2Iterator)findAncestorWithClass(this, LibrarianPositionCodeISO2Iterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

