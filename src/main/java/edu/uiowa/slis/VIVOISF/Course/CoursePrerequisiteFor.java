package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoursePrerequisiteFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoursePrerequisiteFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CoursePrerequisiteFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoursePrerequisiteForIterator theCoursePrerequisiteForIterator = (CoursePrerequisiteForIterator)findAncestorWithClass(this, CoursePrerequisiteForIterator.class);
			pageContext.getOut().print(theCoursePrerequisiteForIterator.getPrerequisiteFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Course for prerequisiteFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for prerequisiteFor tag ");
		}
		return SKIP_BODY;
	}
}

