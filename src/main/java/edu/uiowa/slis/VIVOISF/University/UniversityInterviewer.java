package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityInterviewerIterator theUniversityInterviewerIterator = (UniversityInterviewerIterator)findAncestorWithClass(this, UniversityInterviewerIterator.class);
			pageContext.getOut().print(theUniversityInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing University for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

