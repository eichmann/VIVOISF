package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationRO_0000053Iterator theStudentOrganizationRO_0000053Iterator = (StudentOrganizationRO_0000053Iterator)findAncestorWithClass(this, StudentOrganizationRO_0000053Iterator.class);
			pageContext.getOut().print(theStudentOrganizationRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

