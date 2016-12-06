package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRO_0001025Iterator theFacultyPositionRO_0001025Iterator = (FacultyPositionRO_0001025Iterator)findAncestorWithClass(this, FacultyPositionRO_0001025Iterator.class);
			pageContext.getOut().print(theFacultyPositionRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

