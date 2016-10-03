package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyOrganizerInverseIterator theEmeritusFacultyOrganizerInverseIterator = (EmeritusFacultyOrganizerInverseIterator)findAncestorWithClass(this, EmeritusFacultyOrganizerInverseIterator.class);
			pageContext.getOut().print(theEmeritusFacultyOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for organizer tag ");
		}
		return SKIP_BODY;
	}
}

