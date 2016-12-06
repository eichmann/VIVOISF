package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasSubjectAreaIterator theFacultyAdministrativePositionHasSubjectAreaIterator = (FacultyAdministrativePositionHasSubjectAreaIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

