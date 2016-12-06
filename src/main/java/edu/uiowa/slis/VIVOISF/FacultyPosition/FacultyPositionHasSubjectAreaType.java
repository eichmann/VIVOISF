package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionHasSubjectAreaIterator theFacultyPositionHasSubjectAreaIterator = (FacultyPositionHasSubjectAreaIterator)findAncestorWithClass(this, FacultyPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theFacultyPositionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

