package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianAssigneeForIterator theLibrarianAssigneeForIterator = (LibrarianAssigneeForIterator)findAncestorWithClass(this, LibrarianAssigneeForIterator.class);
			pageContext.getOut().print(theLibrarianAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

