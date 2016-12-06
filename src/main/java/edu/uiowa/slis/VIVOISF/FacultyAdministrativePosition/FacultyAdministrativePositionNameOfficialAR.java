package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameOfficialARIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameOfficialARIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameOfficialARIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

