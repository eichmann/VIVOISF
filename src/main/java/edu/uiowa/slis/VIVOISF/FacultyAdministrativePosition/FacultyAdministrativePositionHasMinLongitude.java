package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasMinLongitudeIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHasMinLongitudeIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

