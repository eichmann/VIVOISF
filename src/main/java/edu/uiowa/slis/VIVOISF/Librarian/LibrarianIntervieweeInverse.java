package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianIntervieweeInverseIterator theLibrarianIntervieweeInverseIterator = (LibrarianIntervieweeInverseIterator)findAncestorWithClass(this, LibrarianIntervieweeInverseIterator.class);
			pageContext.getOut().print(theLibrarianIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

