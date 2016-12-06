package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionAgriculturalAreaTotalIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, FacultyAdministrativePositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

