package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryIssuerInverseIterator theLibraryIssuerInverseIterator = (LibraryIssuerInverseIterator)findAncestorWithClass(this, LibraryIssuerInverseIterator.class);
			pageContext.getOut().print(theLibraryIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for issuer tag ");
		}
		return SKIP_BODY;
	}
}

