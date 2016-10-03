package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorIntervieweeInverseIterator theEmeritusProfessorIntervieweeInverseIterator = (EmeritusProfessorIntervieweeInverseIterator)findAncestorWithClass(this, EmeritusProfessorIntervieweeInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

