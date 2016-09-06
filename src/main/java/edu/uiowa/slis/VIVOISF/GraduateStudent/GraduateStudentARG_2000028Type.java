package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentARG_2000028Iterator theGraduateStudentARG_2000028Iterator = (GraduateStudentARG_2000028Iterator)findAncestorWithClass(this, GraduateStudentARG_2000028Iterator.class);
			pageContext.getOut().print(theGraduateStudentARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

