package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryIntervieweeInverseIterator theLibraryIntervieweeInverseIterator = (LibraryIntervieweeInverseIterator)findAncestorWithClass(this, LibraryIntervieweeInverseIterator.class);
			pageContext.getOut().print(theLibraryIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

