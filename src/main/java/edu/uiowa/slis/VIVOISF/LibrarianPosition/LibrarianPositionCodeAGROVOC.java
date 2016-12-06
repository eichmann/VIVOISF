package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeAGROVOCIterator theLibrarianPosition = (LibrarianPositionCodeAGROVOCIterator)findAncestorWithClass(this, LibrarianPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

