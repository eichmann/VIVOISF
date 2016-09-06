package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentAssigneeForIterator theGraduateStudentAssigneeForIterator = (GraduateStudentAssigneeForIterator)findAncestorWithClass(this, GraduateStudentAssigneeForIterator.class);
			pageContext.getOut().print(theGraduateStudentAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

