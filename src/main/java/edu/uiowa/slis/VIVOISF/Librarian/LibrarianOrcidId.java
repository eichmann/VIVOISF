package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOrcidId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianOrcidIdIterator theLibrarian = (LibrarianOrcidIdIterator)findAncestorWithClass(this, LibrarianOrcidIdIterator.class);
			pageContext.getOut().print(theLibrarian.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

