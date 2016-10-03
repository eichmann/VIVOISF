package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationPerformerInverseIterator theStudentOrganizationPerformerInverseIterator = (StudentOrganizationPerformerInverseIterator)findAncestorWithClass(this, StudentOrganizationPerformerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for performer tag ");
		}
		return SKIP_BODY;
	}
}

