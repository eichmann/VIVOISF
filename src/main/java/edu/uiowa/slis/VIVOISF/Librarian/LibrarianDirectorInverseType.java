package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianDirectorInverseIterator theLibrarianDirectorInverseIterator = (LibrarianDirectorInverseIterator)findAncestorWithClass(this, LibrarianDirectorInverseIterator.class);
			pageContext.getOut().print(theLibrarianDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for director tag ");
		}
		return SKIP_BODY;
	}
}

