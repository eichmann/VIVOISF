package edu.uiowa.slis.VIVOISF.Course;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CourseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CourseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CourseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			if (!theCourse.commitNeeded) {
				pageContext.getOut().print(theCourse.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Course for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			return theCourse.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Course for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Course theCourse = (Course)findAncestorWithClass(this, Course.class);
			theCourse.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Course for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Course for subjectURI tag ");
		}
	}
}

