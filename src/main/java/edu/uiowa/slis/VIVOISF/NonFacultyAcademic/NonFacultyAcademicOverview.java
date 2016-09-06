package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for overview tag ");
		}
	}
}

