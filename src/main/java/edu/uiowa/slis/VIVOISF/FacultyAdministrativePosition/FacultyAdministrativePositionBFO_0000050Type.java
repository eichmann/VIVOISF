package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionBFO_0000050Iterator theFacultyAdministrativePositionBFO_0000050Iterator = (FacultyAdministrativePositionBFO_0000050Iterator)findAncestorWithClass(this, FacultyAdministrativePositionBFO_0000050Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

