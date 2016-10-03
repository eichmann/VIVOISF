package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationPrefixNameIterator theStudentOrganization = (StudentOrganizationPrefixNameIterator)findAncestorWithClass(this, StudentOrganizationPrefixNameIterator.class);
			pageContext.getOut().print(theStudentOrganization.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

