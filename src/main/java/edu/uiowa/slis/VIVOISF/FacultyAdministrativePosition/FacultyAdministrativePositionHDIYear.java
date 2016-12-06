package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHDIYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHDIYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionHDIYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

