package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationRO_0000056Iterator theStudentOrganizationRO_0000056Iterator = (StudentOrganizationRO_0000056Iterator)findAncestorWithClass(this, StudentOrganizationRO_0000056Iterator.class);
			pageContext.getOut().print(theStudentOrganizationRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

