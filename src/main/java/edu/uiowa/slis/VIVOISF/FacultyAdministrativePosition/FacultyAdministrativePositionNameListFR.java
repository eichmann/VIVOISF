package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListFRIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListFRIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListFRIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

