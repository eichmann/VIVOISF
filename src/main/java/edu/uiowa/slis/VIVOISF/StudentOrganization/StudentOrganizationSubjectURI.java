package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			if (!theStudentOrganization.commitNeeded) {
				pageContext.getOut().print(theStudentOrganization.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			return theStudentOrganization.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			theStudentOrganization.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for subjectURI tag ");
		}
	}
}

