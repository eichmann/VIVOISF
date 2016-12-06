package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHDINotesIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHDINotesIterator)findAncestorWithClass(this, FacultyAdministrativePositionHDINotesIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

