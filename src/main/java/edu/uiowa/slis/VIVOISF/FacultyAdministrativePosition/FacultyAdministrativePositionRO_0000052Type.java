package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionRO_0000052Iterator theFacultyAdministrativePositionRO_0000052Iterator = (FacultyAdministrativePositionRO_0000052Iterator)findAncestorWithClass(this, FacultyAdministrativePositionRO_0000052Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

