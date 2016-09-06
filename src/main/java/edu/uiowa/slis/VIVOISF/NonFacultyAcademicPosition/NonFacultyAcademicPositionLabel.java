package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			if (!theNonFacultyAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademicPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			return theNonFacultyAcademicPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			theNonFacultyAcademicPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for label tag ");
		}
	}
}

