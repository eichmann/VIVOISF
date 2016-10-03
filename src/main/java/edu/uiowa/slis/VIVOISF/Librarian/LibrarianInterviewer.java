package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianInterviewerIterator theLibrarianInterviewerIterator = (LibrarianInterviewerIterator)findAncestorWithClass(this, LibrarianInterviewerIterator.class);
			pageContext.getOut().print(theLibrarianInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

