package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentRO_0001025Iterator theStudentRO_0001025Iterator = (StudentRO_0001025Iterator)findAncestorWithClass(this, StudentRO_0001025Iterator.class);
			pageContext.getOut().print(theStudentRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

