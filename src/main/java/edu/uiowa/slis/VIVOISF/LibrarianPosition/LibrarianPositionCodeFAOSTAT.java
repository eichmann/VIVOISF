package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeFAOSTATIterator theLibrarianPosition = (LibrarianPositionCodeFAOSTATIterator)findAncestorWithClass(this, LibrarianPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

