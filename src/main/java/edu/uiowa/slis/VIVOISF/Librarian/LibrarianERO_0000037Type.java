package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianERO_0000037Iterator theLibrarianERO_0000037Iterator = (LibrarianERO_0000037Iterator)findAncestorWithClass(this, LibrarianERO_0000037Iterator.class);
			pageContext.getOut().print(theLibrarianERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

