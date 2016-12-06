package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRelatedByIterator theLibrarianPositionRelatedByIterator = (LibrarianPositionRelatedByIterator)findAncestorWithClass(this, LibrarianPositionRelatedByIterator.class);
			pageContext.getOut().print(theLibrarianPositionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

