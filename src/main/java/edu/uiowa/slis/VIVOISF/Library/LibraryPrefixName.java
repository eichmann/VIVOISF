package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibraryPrefixNameIterator theLibrary = (LibraryPrefixNameIterator)findAncestorWithClass(this, LibraryPrefixNameIterator.class);
			pageContext.getOut().print(theLibrary.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

