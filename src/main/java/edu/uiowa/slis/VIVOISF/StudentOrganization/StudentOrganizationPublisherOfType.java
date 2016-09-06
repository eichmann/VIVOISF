package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationPublisherOfIterator theStudentOrganizationPublisherOfIterator = (StudentOrganizationPublisherOfIterator)findAncestorWithClass(this, StudentOrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theStudentOrganizationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

