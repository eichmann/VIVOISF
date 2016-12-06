package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionGDPYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionGDPYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionGDPYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

