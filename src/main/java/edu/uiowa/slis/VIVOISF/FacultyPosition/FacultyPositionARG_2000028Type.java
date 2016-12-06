package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionARG_2000028Iterator theFacultyPositionARG_2000028Iterator = (FacultyPositionARG_2000028Iterator)findAncestorWithClass(this, FacultyPositionARG_2000028Iterator.class);
			pageContext.getOut().print(theFacultyPositionARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

