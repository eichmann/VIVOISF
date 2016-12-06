package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNationalityRUIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNationalityRUIterator)findAncestorWithClass(this, FacultyAdministrativePositionNationalityRUIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

