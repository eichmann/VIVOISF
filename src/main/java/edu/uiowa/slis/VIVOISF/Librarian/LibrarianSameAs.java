package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianSameAsIterator theLibrarian = (LibrarianSameAsIterator)findAncestorWithClass(this, LibrarianSameAsIterator.class);
			pageContext.getOut().print(theLibrarian.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

