package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramInterviewerInverseIterator theProgramInterviewerInverseIterator = (ProgramInterviewerInverseIterator)findAncestorWithClass(this, ProgramInterviewerInverseIterator.class);
			pageContext.getOut().print(theProgramInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

