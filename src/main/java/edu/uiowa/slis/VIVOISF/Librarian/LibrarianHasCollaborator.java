package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianHasCollaboratorIterator theLibrarianHasCollaboratorIterator = (LibrarianHasCollaboratorIterator)findAncestorWithClass(this, LibrarianHasCollaboratorIterator.class);
			pageContext.getOut().print(theLibrarianHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

