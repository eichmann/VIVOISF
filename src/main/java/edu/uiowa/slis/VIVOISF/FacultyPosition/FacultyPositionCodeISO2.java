package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeISO2Iterator theFacultyPosition = (FacultyPositionCodeISO2Iterator)findAncestorWithClass(this, FacultyPositionCodeISO2Iterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

