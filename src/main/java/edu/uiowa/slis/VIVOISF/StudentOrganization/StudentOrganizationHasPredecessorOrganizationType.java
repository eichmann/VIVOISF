package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationHasPredecessorOrganizationIterator theStudentOrganizationHasPredecessorOrganizationIterator = (StudentOrganizationHasPredecessorOrganizationIterator)findAncestorWithClass(this, StudentOrganizationHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theStudentOrganizationHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

