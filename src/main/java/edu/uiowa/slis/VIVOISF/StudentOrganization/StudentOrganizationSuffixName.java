package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationSuffixNameIterator theStudentOrganization = (StudentOrganizationSuffixNameIterator)findAncestorWithClass(this, StudentOrganizationSuffixNameIterator.class);
			pageContext.getOut().print(theStudentOrganization.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

