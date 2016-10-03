package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryInterviewerInverseIterator theLibraryInterviewerInverseIterator = (LibraryInterviewerInverseIterator)findAncestorWithClass(this, LibraryInterviewerInverseIterator.class);
			pageContext.getOut().print(theLibraryInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

