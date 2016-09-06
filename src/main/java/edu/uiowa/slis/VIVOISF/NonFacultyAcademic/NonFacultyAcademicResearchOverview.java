package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for researchOverview tag ");
		}
	}
}

