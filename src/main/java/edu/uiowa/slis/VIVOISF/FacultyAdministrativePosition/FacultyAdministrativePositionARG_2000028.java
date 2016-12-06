package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionARG_2000028Iterator theFacultyAdministrativePositionARG_2000028Iterator = (FacultyAdministrativePositionARG_2000028Iterator)findAncestorWithClass(this, FacultyAdministrativePositionARG_2000028Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

