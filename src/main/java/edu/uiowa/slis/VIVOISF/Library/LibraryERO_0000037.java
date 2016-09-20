package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryERO_0000037Iterator theLibraryERO_0000037Iterator = (LibraryERO_0000037Iterator)findAncestorWithClass(this, LibraryERO_0000037Iterator.class);
			pageContext.getOut().print(theLibraryERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

