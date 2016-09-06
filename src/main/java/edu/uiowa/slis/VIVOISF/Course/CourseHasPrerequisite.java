package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseHasPrerequisite extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseHasPrerequisite currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseHasPrerequisite.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourseHasPrerequisiteIterator theCourseHasPrerequisiteIterator = (CourseHasPrerequisiteIterator)findAncestorWithClass(this, CourseHasPrerequisiteIterator.class);
			pageContext.getOut().print(theCourseHasPrerequisiteIterator.getHasPrerequisite());
		} catch (Exception e) {
			log.error("Can't find enclosing Course for hasPrerequisite tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for hasPrerequisite tag ");
		}
		return SKIP_BODY;
	}
}

