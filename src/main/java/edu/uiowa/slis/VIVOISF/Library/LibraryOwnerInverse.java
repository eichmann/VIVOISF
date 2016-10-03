package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryOwnerInverseIterator theLibraryOwnerInverseIterator = (LibraryOwnerInverseIterator)findAncestorWithClass(this, LibraryOwnerInverseIterator.class);
			pageContext.getOut().print(theLibraryOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for owner tag ");
		}
		return SKIP_BODY;
	}
}

