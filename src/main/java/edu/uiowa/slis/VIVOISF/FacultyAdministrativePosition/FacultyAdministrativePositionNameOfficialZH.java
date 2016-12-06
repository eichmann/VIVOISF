package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameOfficialZHIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameOfficialZHIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameOfficialZHIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

