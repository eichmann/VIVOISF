package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryOwnerInverseIterator theLibraryOwnerInverseIterator = (LibraryOwnerInverseIterator)findAncestorWithClass(this, LibraryOwnerInverseIterator.class);
			pageContext.getOut().print(theLibraryOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for owner tag ");
		}
		return SKIP_BODY;
	}
}

