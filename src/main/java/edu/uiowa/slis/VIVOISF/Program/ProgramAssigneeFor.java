package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramAssigneeForIterator theProgramAssigneeForIterator = (ProgramAssigneeForIterator)findAncestorWithClass(this, ProgramAssigneeForIterator.class);
			pageContext.getOut().print(theProgramAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

