package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonInterviewerIterator thePersonInterviewerIterator = (PersonInterviewerIterator)findAncestorWithClass(this, PersonInterviewerIterator.class);
			pageContext.getOut().print(thePersonInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

