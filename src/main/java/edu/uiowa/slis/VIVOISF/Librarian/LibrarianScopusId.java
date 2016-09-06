package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianScopusIdIterator theLibrarian = (LibrarianScopusIdIterator)findAncestorWithClass(this, LibrarianScopusIdIterator.class);
			pageContext.getOut().print(theLibrarian.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

