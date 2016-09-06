package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			if (!theStudentOrganization.commitNeeded) {
				pageContext.getOut().print(theStudentOrganization.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			return theStudentOrganization.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			theStudentOrganization.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for label tag ");
		}
	}
}

