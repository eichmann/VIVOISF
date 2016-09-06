package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentRO_0000053Iterator theStudentRO_0000053Iterator = (StudentRO_0000053Iterator)findAncestorWithClass(this, StudentRO_0000053Iterator.class);
			pageContext.getOut().print(theStudentRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

