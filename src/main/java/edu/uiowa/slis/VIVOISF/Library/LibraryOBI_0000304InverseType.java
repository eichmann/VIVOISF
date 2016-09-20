package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryOBI_0000304InverseIterator theLibraryOBI_0000304InverseIterator = (LibraryOBI_0000304InverseIterator)findAncestorWithClass(this, LibraryOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theLibraryOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

