package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameListITIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameListITIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameListITIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

