package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryGoverningAuthorityForIterator theLibraryGoverningAuthorityForIterator = (LibraryGoverningAuthorityForIterator)findAncestorWithClass(this, LibraryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theLibraryGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

