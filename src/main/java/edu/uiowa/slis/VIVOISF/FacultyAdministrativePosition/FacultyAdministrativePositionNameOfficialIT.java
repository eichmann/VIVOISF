package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameOfficialITIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameOfficialITIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameOfficialITIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

