package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityITIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityITIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityITIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

