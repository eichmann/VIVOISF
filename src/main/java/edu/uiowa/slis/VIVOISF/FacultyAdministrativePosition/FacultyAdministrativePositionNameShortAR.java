package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortARIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortARIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortARIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

