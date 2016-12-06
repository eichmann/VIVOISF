package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameOfficialRUIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameOfficialRUIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameOfficialRUIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

