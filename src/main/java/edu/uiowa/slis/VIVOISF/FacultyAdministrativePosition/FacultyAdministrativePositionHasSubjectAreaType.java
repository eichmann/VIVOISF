package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasSubjectAreaIterator theFacultyAdministrativePositionHasSubjectAreaIterator = (FacultyAdministrativePositionHasSubjectAreaIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

