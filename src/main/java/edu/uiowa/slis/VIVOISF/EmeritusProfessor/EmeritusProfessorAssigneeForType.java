package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorAssigneeForIterator theEmeritusProfessorAssigneeForIterator = (EmeritusProfessorAssigneeForIterator)findAncestorWithClass(this, EmeritusProfessorAssigneeForIterator.class);
			pageContext.getOut().print(theEmeritusProfessorAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

