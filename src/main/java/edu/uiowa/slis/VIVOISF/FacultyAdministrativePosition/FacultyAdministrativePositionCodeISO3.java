package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeISO3Iterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeISO3Iterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeISO3Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

