package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityENIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityENIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityENIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

