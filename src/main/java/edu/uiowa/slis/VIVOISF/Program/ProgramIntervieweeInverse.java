package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramIntervieweeInverseIterator theProgramIntervieweeInverseIterator = (ProgramIntervieweeInverseIterator)findAncestorWithClass(this, ProgramIntervieweeInverseIterator.class);
			pageContext.getOut().print(theProgramIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

