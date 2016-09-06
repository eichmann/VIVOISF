package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			if (!theNonFacultyAcademicPosition.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademicPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			return theNonFacultyAcademicPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NonFacultyAcademicPosition theNonFacultyAcademicPosition = (NonFacultyAcademicPosition)findAncestorWithClass(this, NonFacultyAcademicPosition.class);
			theNonFacultyAcademicPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for subjectURI tag ");
		}
	}
}

