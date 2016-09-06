package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRO_0000052Iterator theFacultyPositionRO_0000052Iterator = (FacultyPositionRO_0000052Iterator)findAncestorWithClass(this, FacultyPositionRO_0000052Iterator.class);
			pageContext.getOut().print(theFacultyPositionRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

