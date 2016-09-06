package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRO_0000053Iterator theLibrarianRO_0000053Iterator = (LibrarianRO_0000053Iterator)findAncestorWithClass(this, LibrarianRO_0000053Iterator.class);
			pageContext.getOut().print(theLibrarianRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

