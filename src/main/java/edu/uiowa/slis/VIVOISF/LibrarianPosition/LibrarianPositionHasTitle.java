package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasTitleIterator theLibrarianPositionHasTitleIterator = (LibrarianPositionHasTitleIterator)findAncestorWithClass(this, LibrarianPositionHasTitleIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

