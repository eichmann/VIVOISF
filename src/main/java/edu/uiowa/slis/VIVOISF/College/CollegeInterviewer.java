package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeInterviewerIterator theCollegeInterviewerIterator = (CollegeInterviewerIterator)findAncestorWithClass(this, CollegeInterviewerIterator.class);
			pageContext.getOut().print(theCollegeInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing College for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

