package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasResearchAreaIterator theNonFacultyAcademicPositionHasResearchAreaIterator = (NonFacultyAcademicPositionHasResearchAreaIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

