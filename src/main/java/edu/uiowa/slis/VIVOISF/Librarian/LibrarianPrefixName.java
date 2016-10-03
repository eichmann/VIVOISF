package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPrefixNameIterator theLibrarian = (LibrarianPrefixNameIterator)findAncestorWithClass(this, LibrarianPrefixNameIterator.class);
			pageContext.getOut().print(theLibrarian.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

