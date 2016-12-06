package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityESIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityESIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityESIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

