package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorIntervieweeIterator theEmeritusProfessorIntervieweeIterator = (EmeritusProfessorIntervieweeIterator)findAncestorWithClass(this, EmeritusProfessorIntervieweeIterator.class);
			pageContext.getOut().print(theEmeritusProfessorIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

