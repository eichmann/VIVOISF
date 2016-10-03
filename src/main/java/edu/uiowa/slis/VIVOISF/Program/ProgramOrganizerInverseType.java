package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramOrganizerInverseIterator theProgramOrganizerInverseIterator = (ProgramOrganizerInverseIterator)findAncestorWithClass(this, ProgramOrganizerInverseIterator.class);
			pageContext.getOut().print(theProgramOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for organizer tag ");
		}
		return SKIP_BODY;
	}
}

