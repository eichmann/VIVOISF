package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramOrganizerInverseIterator theProgramOrganizerInverseIterator = (ProgramOrganizerInverseIterator)findAncestorWithClass(this, ProgramOrganizerInverseIterator.class);
			pageContext.getOut().print(theProgramOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for organizer tag ");
		}
		return SKIP_BODY;
	}
}

