package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for teachingOverview tag ");
		}
	}
}

