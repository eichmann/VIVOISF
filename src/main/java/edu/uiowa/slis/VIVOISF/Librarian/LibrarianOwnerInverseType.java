package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianOwnerInverseIterator theLibrarianOwnerInverseIterator = (LibrarianOwnerInverseIterator)findAncestorWithClass(this, LibrarianOwnerInverseIterator.class);
			pageContext.getOut().print(theLibrarianOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for owner tag ");
		}
		return SKIP_BODY;
	}
}

