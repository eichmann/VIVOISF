package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentARG_2000028Iterator theStudentARG_2000028Iterator = (StudentARG_2000028Iterator)findAncestorWithClass(this, StudentARG_2000028Iterator.class);
			pageContext.getOut().print(theStudentARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

