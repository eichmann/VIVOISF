package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentRecipientInverseIterator theStudentRecipientInverseIterator = (StudentRecipientInverseIterator)findAncestorWithClass(this, StudentRecipientInverseIterator.class);
			pageContext.getOut().print(theStudentRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for recipient tag ");
		}
		return SKIP_BODY;
	}
}

