package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRO_0002234Iterator theFacultyAdministrativePositionRO_0002234Iterator = (FacultyAdministrativePositionRO_0002234Iterator)findAncestorWithClass(this, FacultyAdministrativePositionRO_0002234Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

