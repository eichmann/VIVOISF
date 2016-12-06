package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeGAULIterator theLibrarianPosition = (LibrarianPositionCodeGAULIterator)findAncestorWithClass(this, LibrarianPositionCodeGAULIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

