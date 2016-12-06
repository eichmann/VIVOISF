package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeUNDPIterator theLibrarianPosition = (LibrarianPositionCodeUNDPIterator)findAncestorWithClass(this, LibrarianPositionCodeUNDPIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

