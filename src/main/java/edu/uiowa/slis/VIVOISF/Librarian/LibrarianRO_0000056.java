package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRO_0000056Iterator theLibrarianRO_0000056Iterator = (LibrarianRO_0000056Iterator)findAncestorWithClass(this, LibrarianRO_0000056Iterator.class);
			pageContext.getOut().print(theLibrarianRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

