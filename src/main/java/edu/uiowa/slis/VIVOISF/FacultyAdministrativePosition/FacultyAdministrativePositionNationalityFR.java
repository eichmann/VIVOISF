package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityFRIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityFRIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityFRIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

