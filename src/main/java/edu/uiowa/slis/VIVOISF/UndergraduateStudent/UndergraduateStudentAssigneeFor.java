package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentAssigneeForIterator theUndergraduateStudentAssigneeForIterator = (UndergraduateStudentAssigneeForIterator)findAncestorWithClass(this, UndergraduateStudentAssigneeForIterator.class);
			pageContext.getOut().print(theUndergraduateStudentAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

