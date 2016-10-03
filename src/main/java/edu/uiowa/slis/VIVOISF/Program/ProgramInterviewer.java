package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramInterviewerIterator theProgramInterviewerIterator = (ProgramInterviewerIterator)findAncestorWithClass(this, ProgramInterviewerIterator.class);
			pageContext.getOut().print(theProgramInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

