package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeUNIterator theLibrarianPosition = (LibrarianPositionCodeUNIterator)findAncestorWithClass(this, LibrarianPositionCodeUNIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

