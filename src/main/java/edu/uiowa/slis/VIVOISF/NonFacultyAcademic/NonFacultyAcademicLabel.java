package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for label tag ");
		}
	}
}

