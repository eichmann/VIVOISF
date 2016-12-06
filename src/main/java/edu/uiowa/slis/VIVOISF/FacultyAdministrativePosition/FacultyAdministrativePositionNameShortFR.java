package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortFRIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortFRIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortFRIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

