package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarySuffixNameIterator theLibrary = (LibrarySuffixNameIterator)findAncestorWithClass(this, LibrarySuffixNameIterator.class);
			pageContext.getOut().print(theLibrary.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

