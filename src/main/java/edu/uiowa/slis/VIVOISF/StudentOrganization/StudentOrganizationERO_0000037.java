package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationERO_0000037Iterator theStudentOrganizationERO_0000037Iterator = (StudentOrganizationERO_0000037Iterator)findAncestorWithClass(this, StudentOrganizationERO_0000037Iterator.class);
			pageContext.getOut().print(theStudentOrganizationERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

