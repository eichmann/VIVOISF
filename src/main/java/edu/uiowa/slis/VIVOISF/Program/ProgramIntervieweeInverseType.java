package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramIntervieweeInverseIterator theProgramIntervieweeInverseIterator = (ProgramIntervieweeInverseIterator)findAncestorWithClass(this, ProgramIntervieweeInverseIterator.class);
			pageContext.getOut().print(theProgramIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

