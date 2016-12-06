package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasSubjectAreaIterator theLibrarianPositionHasSubjectAreaIterator = (LibrarianPositionHasSubjectAreaIterator)findAncestorWithClass(this, LibrarianPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

