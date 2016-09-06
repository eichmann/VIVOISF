package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRelatedByIterator theLibrarianRelatedByIterator = (LibrarianRelatedByIterator)findAncestorWithClass(this, LibrarianRelatedByIterator.class);
			pageContext.getOut().print(theLibrarianRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

