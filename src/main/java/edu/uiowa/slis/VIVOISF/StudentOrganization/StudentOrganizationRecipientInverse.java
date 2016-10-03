package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationRecipientInverseIterator theStudentOrganizationRecipientInverseIterator = (StudentOrganizationRecipientInverseIterator)findAncestorWithClass(this, StudentOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

