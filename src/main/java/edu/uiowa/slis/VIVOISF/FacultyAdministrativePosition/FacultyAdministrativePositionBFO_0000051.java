package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionBFO_0000051Iterator theFacultyAdministrativePositionBFO_0000051Iterator = (FacultyAdministrativePositionBFO_0000051Iterator)findAncestorWithClass(this, FacultyAdministrativePositionBFO_0000051Iterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

