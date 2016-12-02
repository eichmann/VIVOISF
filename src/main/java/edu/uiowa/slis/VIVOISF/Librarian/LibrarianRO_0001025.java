package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRO_0001025.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianRO_0001025Iterator theLibrarian = (LibrarianRO_0001025Iterator)findAncestorWithClass(this, LibrarianRO_0001025Iterator.class);
			pageContext.getOut().print(theLibrarian.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

