package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianERO_0000397Iterator theLibrarianERO_0000397Iterator = (LibrarianERO_0000397Iterator)findAncestorWithClass(this, LibrarianERO_0000397Iterator.class);
			pageContext.getOut().print(theLibrarianERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

