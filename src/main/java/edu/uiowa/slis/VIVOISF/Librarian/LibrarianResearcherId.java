package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianResearcherIdIterator theLibrarian = (LibrarianResearcherIdIterator)findAncestorWithClass(this, LibrarianResearcherIdIterator.class);
			pageContext.getOut().print(theLibrarian.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

