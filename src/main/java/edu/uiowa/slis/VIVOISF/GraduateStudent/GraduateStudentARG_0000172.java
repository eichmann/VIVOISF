package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentARG_0000172 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentARG_0000172 currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentARG_0000172.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentARG_0000172Iterator theGraduateStudent = (GraduateStudentARG_0000172Iterator)findAncestorWithClass(this, GraduateStudentARG_0000172Iterator.class);
			pageContext.getOut().print(theGraduateStudent.getARG_0000172());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for ARG_0000172 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for ARG_0000172 tag ");
		}
		return SKIP_BODY;
	}
}

