package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianSuffixNameIterator theLibrarian = (LibrarianSuffixNameIterator)findAncestorWithClass(this, LibrarianSuffixNameIterator.class);
			pageContext.getOut().print(theLibrarian.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

