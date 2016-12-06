package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionGeographicFocusIterator theFacultyAdministrativePositionGeographicFocusIterator = (FacultyAdministrativePositionGeographicFocusIterator)findAncestorWithClass(this, FacultyAdministrativePositionGeographicFocusIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

