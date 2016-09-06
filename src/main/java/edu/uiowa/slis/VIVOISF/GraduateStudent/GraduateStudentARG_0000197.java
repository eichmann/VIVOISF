package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentARG_0000197Iterator theGraduateStudent = (GraduateStudentARG_0000197Iterator)findAncestorWithClass(this, GraduateStudentARG_0000197Iterator.class);
			pageContext.getOut().print(theGraduateStudent.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

