package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			if (!theNonFacultyAcademic.commitNeeded) {
				pageContext.getOut().print(theNonFacultyAcademic.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			return theNonFacultyAcademic.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NonFacultyAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NonFacultyAcademic theNonFacultyAcademic = (NonFacultyAcademic)findAncestorWithClass(this, NonFacultyAcademic.class);
			theNonFacultyAcademic.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for subjectURI tag ");
		}
	}
}

