package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentAssigneeForIterator theStudentAssigneeForIterator = (StudentAssigneeForIterator)findAncestorWithClass(this, StudentAssigneeForIterator.class);
			pageContext.getOut().print(theStudentAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

