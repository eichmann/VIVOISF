package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorAssigneeForIterator theEmeritusProfessorAssigneeForIterator = (EmeritusProfessorAssigneeForIterator)findAncestorWithClass(this, EmeritusProfessorAssigneeForIterator.class);
			pageContext.getOut().print(theEmeritusProfessorAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

