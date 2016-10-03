package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorInterviewerInverseIterator theEmeritusProfessorInterviewerInverseIterator = (EmeritusProfessorInterviewerInverseIterator)findAncestorWithClass(this, EmeritusProfessorInterviewerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

