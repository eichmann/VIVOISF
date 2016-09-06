package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			if (!theNonAcademic.commitNeeded) {
				pageContext.getOut().print(theNonAcademic.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			return theNonAcademic.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			NonAcademic theNonAcademic = (NonAcademic)findAncestorWithClass(this, NonAcademic.class);
			theNonAcademic.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for teachingOverview tag ");
		}
	}
}

