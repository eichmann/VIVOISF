package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CourseRO_0000057Iterator theCourseRO_0000057Iterator = (CourseRO_0000057Iterator)findAncestorWithClass(this, CourseRO_0000057Iterator.class);
			pageContext.getOut().print(theCourseRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Course for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

