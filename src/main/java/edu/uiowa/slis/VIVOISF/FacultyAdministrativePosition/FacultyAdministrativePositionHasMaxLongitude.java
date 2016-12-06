package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasMaxLongitudeIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHasMaxLongitudeIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

