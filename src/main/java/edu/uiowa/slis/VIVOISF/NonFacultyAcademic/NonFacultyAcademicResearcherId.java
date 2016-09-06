package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicResearcherId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicResearcherId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicResearcherId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicResearcherIdIterator theNonFacultyAcademic = (NonFacultyAcademicResearcherIdIterator)findAncestorWithClass(this, NonFacultyAcademicResearcherIdIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getResearcherId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for researcherId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for researcherId tag ");
		}
		return SKIP_BODY;
	}
}

