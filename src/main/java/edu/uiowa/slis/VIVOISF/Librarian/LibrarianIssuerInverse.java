package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianIssuerInverseIterator theLibrarianIssuerInverseIterator = (LibrarianIssuerInverseIterator)findAncestorWithClass(this, LibrarianIssuerInverseIterator.class);
			pageContext.getOut().print(theLibrarianIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for issuer tag ");
		}
		return SKIP_BODY;
	}
}

