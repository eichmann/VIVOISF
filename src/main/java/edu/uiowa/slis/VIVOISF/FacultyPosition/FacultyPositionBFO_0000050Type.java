package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionBFO_0000050Iterator theFacultyPositionBFO_0000050Iterator = (FacultyPositionBFO_0000050Iterator)findAncestorWithClass(this, FacultyPositionBFO_0000050Iterator.class);
			pageContext.getOut().print(theFacultyPositionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

