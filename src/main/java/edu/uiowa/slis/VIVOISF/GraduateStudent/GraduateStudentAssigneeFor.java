package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentAssigneeForIterator theGraduateStudentAssigneeForIterator = (GraduateStudentAssigneeForIterator)findAncestorWithClass(this, GraduateStudentAssigneeForIterator.class);
			pageContext.getOut().print(theGraduateStudentAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

