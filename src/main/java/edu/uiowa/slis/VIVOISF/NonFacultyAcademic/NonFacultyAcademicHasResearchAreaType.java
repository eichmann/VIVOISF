package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicHasResearchAreaIterator theNonFacultyAcademicHasResearchAreaIterator = (NonFacultyAcademicHasResearchAreaIterator)findAncestorWithClass(this, NonFacultyAcademicHasResearchAreaIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

