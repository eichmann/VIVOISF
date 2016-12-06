package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHDITotalIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionHDITotalIterator)findAncestorWithClass(this, FacultyAdministrativePositionHDITotalIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

