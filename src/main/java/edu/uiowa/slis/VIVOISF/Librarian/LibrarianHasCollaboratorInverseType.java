package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianHasCollaboratorInverseIterator theLibrarianHasCollaboratorInverseIterator = (LibrarianHasCollaboratorInverseIterator)findAncestorWithClass(this, LibrarianHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theLibrarianHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

