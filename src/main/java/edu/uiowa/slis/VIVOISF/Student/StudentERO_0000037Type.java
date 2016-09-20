package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentERO_0000037Iterator theStudentERO_0000037Iterator = (StudentERO_0000037Iterator)findAncestorWithClass(this, StudentERO_0000037Iterator.class);
			pageContext.getOut().print(theStudentERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

