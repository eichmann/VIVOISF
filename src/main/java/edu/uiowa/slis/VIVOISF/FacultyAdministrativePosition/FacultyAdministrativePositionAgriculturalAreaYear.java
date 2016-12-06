package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionAgriculturalAreaYearIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionAgriculturalAreaYearIterator)findAncestorWithClass(this, FacultyAdministrativePositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

