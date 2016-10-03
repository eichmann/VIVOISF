package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseOrganizerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseOrganizerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseOrganizerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourseOrganizerIterator theCourseOrganizerIterator = (CourseOrganizerIterator)findAncestorWithClass(this, CourseOrganizerIterator.class);
			pageContext.getOut().print(theCourseOrganizerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Course for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for organizer tag ");
		}
		return SKIP_BODY;
	}
}

