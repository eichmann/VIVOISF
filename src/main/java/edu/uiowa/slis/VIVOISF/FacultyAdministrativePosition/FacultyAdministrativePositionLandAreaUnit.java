package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionLandAreaUnitIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionLandAreaUnitIterator)findAncestorWithClass(this, FacultyAdministrativePositionLandAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

