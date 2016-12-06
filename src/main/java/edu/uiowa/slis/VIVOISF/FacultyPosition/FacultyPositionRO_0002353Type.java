package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRO_0002353Iterator theFacultyPositionRO_0002353Iterator = (FacultyPositionRO_0002353Iterator)findAncestorWithClass(this, FacultyPositionRO_0002353Iterator.class);
			pageContext.getOut().print(theFacultyPositionRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

