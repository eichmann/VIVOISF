package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryIntervieweeIterator theLibraryIntervieweeIterator = (LibraryIntervieweeIterator)findAncestorWithClass(this, LibraryIntervieweeIterator.class);
			pageContext.getOut().print(theLibraryIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

