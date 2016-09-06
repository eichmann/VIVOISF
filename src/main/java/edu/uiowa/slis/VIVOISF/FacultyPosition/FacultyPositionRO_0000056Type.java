package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRO_0000056Iterator theFacultyPositionRO_0000056Iterator = (FacultyPositionRO_0000056Iterator)findAncestorWithClass(this, FacultyPositionRO_0000056Iterator.class);
			pageContext.getOut().print(theFacultyPositionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

