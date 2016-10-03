package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationProducerInverseIterator theStudentOrganizationProducerInverseIterator = (StudentOrganizationProducerInverseIterator)findAncestorWithClass(this, StudentOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

