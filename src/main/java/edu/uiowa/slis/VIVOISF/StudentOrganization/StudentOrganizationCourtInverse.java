package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationCourtInverseIterator theStudentOrganizationCourtInverseIterator = (StudentOrganizationCourtInverseIterator)findAncestorWithClass(this, StudentOrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for court tag ");
		}
		return SKIP_BODY;
	}
}

