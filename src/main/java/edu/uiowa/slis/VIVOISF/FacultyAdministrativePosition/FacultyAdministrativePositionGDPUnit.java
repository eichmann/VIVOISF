package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionGDPUnitIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionGDPUnitIterator)findAncestorWithClass(this, FacultyAdministrativePositionGDPUnitIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

