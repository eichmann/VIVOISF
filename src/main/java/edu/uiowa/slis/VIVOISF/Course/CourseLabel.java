package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			if (!theCourse.commitNeeded) {
				pageContext.getOut().print(theCourse.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Course for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			return theCourse.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Course for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			theCourse.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Course for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for label tag ");
		}
	}
}

