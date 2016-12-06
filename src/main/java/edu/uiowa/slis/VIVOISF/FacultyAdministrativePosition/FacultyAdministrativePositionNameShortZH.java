package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortZHIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortZHIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortZHIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

