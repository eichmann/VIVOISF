package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionRO_0002234Iterator theFacultyPositionRO_0002234Iterator = (FacultyPositionRO_0002234Iterator)findAncestorWithClass(this, FacultyPositionRO_0002234Iterator.class);
			pageContext.getOut().print(theFacultyPositionRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

