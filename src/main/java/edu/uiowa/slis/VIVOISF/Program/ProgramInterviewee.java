package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramIntervieweeIterator theProgramIntervieweeIterator = (ProgramIntervieweeIterator)findAncestorWithClass(this, ProgramIntervieweeIterator.class);
			pageContext.getOut().print(theProgramIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

