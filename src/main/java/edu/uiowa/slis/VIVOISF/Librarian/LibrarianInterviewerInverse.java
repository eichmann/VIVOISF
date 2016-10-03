package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianInterviewerInverseIterator theLibrarianInterviewerInverseIterator = (LibrarianInterviewerInverseIterator)findAncestorWithClass(this, LibrarianInterviewerInverseIterator.class);
			pageContext.getOut().print(theLibrarianInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

