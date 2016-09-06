package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHrJobTitleIterator theLibrarianPosition = (LibrarianPositionHrJobTitleIterator)findAncestorWithClass(this, LibrarianPositionHrJobTitleIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

