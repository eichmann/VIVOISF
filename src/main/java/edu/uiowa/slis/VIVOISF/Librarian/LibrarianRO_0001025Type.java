package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRO_0001025Iterator theLibrarianRO_0001025Iterator = (LibrarianRO_0001025Iterator)findAncestorWithClass(this, LibrarianRO_0001025Iterator.class);
			pageContext.getOut().print(theLibrarianRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

