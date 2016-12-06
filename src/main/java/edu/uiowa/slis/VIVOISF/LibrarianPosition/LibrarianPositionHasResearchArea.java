package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasResearchAreaIterator theLibrarianPositionHasResearchAreaIterator = (LibrarianPositionHasResearchAreaIterator)findAncestorWithClass(this, LibrarianPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

