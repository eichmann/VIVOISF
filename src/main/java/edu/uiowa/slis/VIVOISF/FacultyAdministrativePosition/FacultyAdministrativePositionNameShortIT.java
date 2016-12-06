package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionNameShortITIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionNameShortITIterator)findAncestorWithClass(this, FacultyAdministrativePositionNameShortITIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

