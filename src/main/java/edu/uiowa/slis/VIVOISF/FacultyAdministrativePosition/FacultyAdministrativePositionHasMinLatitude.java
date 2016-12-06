package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasMinLatitudeIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHasMinLatitudeIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

