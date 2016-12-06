package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityARIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityARIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityARIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

