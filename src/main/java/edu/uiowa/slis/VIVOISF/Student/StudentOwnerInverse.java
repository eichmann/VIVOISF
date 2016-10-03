package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOwnerInverseIterator theStudentOwnerInverseIterator = (StudentOwnerInverseIterator)findAncestorWithClass(this, StudentOwnerInverseIterator.class);
			pageContext.getOut().print(theStudentOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for owner tag ");
		}
		return SKIP_BODY;
	}
}

