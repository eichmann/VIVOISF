package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameOfficialESIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameOfficialESIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameOfficialESIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

