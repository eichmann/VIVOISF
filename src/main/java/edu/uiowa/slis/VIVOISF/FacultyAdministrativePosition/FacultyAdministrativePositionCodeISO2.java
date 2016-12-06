package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeISO2Iterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeISO2Iterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeISO2Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

