package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianIntervieweeIterator theLibrarianIntervieweeIterator = (LibrarianIntervieweeIterator)findAncestorWithClass(this, LibrarianIntervieweeIterator.class);
			pageContext.getOut().print(theLibrarianIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

