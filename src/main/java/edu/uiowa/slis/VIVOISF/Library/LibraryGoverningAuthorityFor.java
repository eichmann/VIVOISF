package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryGoverningAuthorityForIterator theLibraryGoverningAuthorityForIterator = (LibraryGoverningAuthorityForIterator)findAncestorWithClass(this, LibraryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theLibraryGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

