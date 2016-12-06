package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionLandAreaTotalIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionLandAreaTotalIterator)findAncestorWithClass(this, FacultyAdministrativePositionLandAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

