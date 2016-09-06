package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianERACommonsIdIterator theLibrarian = (LibrarianERACommonsIdIterator)findAncestorWithClass(this, LibrarianERACommonsIdIterator.class);
			pageContext.getOut().print(theLibrarian.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

