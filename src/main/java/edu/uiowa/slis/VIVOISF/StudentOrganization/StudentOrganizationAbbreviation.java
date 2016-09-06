package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			if (!theStudentOrganization.commitNeeded) {
				pageContext.getOut().print(theStudentOrganization.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			return theStudentOrganization.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudentOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			theStudentOrganization.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for abbreviation tag ");
		}
	}
}

