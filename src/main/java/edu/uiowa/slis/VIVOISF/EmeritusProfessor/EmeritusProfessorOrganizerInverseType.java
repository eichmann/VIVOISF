package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorOrganizerInverseIterator theEmeritusProfessorOrganizerInverseIterator = (EmeritusProfessorOrganizerInverseIterator)findAncestorWithClass(this, EmeritusProfessorOrganizerInverseIterator.class);
			pageContext.getOut().print(theEmeritusProfessorOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for organizer tag ");
		}
		return SKIP_BODY;
	}
}

