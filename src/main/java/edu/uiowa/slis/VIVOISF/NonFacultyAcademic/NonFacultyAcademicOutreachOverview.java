package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for outreachOverview tag ");
		}
	}
}

