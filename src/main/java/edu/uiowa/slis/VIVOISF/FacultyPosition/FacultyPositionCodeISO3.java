package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeISO3Iterator theFacultyPosition = (FacultyPositionCodeISO3Iterator)findAncestorWithClass(this, FacultyPositionCodeISO3Iterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

