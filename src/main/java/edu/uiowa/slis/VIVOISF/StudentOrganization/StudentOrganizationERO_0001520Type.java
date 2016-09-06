package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationERO_0001520Iterator theStudentOrganizationERO_0001520Iterator = (StudentOrganizationERO_0001520Iterator)findAncestorWithClass(this, StudentOrganizationERO_0001520Iterator.class);
			pageContext.getOut().print(theStudentOrganizationERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

