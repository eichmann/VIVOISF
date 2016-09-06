package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentERACommonsIdIterator theStudent = (StudentERACommonsIdIterator)findAncestorWithClass(this, StudentERACommonsIdIterator.class);
			pageContext.getOut().print(theStudent.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

