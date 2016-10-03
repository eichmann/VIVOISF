package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyInterviewerIterator theEmeritusFacultyInterviewerIterator = (EmeritusFacultyInterviewerIterator)findAncestorWithClass(this, EmeritusFacultyInterviewerIterator.class);
			pageContext.getOut().print(theEmeritusFacultyInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

