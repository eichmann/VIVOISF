package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationSponsorsIterator theStudentOrganizationSponsorsIterator = (StudentOrganizationSponsorsIterator)findAncestorWithClass(this, StudentOrganizationSponsorsIterator.class);
			pageContext.getOut().print(theStudentOrganizationSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

