package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationRecipientInverseIterator theStudentOrganizationRecipientInverseIterator = (StudentOrganizationRecipientInverseIterator)findAncestorWithClass(this, StudentOrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

