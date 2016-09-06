package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianARG_0000197Iterator theLibrarian = (LibrarianARG_0000197Iterator)findAncestorWithClass(this, LibrarianARG_0000197Iterator.class);
			pageContext.getOut().print(theLibrarian.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

