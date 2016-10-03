package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianEditorInverseIterator theLibrarianEditorInverseIterator = (LibrarianEditorInverseIterator)findAncestorWithClass(this, LibrarianEditorInverseIterator.class);
			pageContext.getOut().print(theLibrarianEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for editor tag ");
		}
		return SKIP_BODY;
	}
}

