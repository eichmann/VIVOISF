package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListARIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListARIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListARIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

