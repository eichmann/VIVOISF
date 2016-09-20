package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianIssuerInverseIterator theLibrarianIssuerInverseIterator = (LibrarianIssuerInverseIterator)findAncestorWithClass(this, LibrarianIssuerInverseIterator.class);
			pageContext.getOut().print(theLibrarianIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for issuer tag ");
		}
		return SKIP_BODY;
	}
}

