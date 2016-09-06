package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			if (!theGraduateStudent.commitNeeded) {
				pageContext.getOut().print(theGraduateStudent.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			return theGraduateStudent.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing GraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			GraduateStudent theGraduateStudent = (GraduateStudent)findAncestorWithClass(this, GraduateStudent.class);
			theGraduateStudent.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for overview tag ");
		}
	}
}

