package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			if (!theAcademicDepartment.commitNeeded) {
				pageContext.getOut().print(theAcademicDepartment.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			return theAcademicDepartment.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDepartment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AcademicDepartment theAcademicDepartment = (AcademicDepartment)findAncestorWithClass(this, AcademicDepartment.class);
			theAcademicDepartment.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for subjectURI tag ");
		}
	}
}

