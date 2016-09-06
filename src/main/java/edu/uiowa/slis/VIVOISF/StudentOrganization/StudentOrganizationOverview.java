package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			if (!theStudentOrganization.commitNeeded) {
				pageContext.getOut().print(theStudentOrganization.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			return theStudentOrganization.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing StudentOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			StudentOrganization theStudentOrganization = (StudentOrganization)findAncestorWithClass(this, StudentOrganization.class);
			theStudentOrganization.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for overview tag ");
		}
	}
}

