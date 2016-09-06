package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHrJobTitleIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHrJobTitleIterator)findAncestorWithClass(this, FacultyAdministrativePositionHrJobTitleIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

