package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionAgriculturalAreaUnitIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, FacultyAdministrativePositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

