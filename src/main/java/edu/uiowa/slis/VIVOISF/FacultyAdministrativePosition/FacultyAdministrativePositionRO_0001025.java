package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRO_0001025Iterator theFacultyAdministrativePositionRO_0001025Iterator = (FacultyAdministrativePositionRO_0001025Iterator)findAncestorWithClass(this, FacultyAdministrativePositionRO_0001025Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

