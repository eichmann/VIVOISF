package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentERO_0000397Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentERO_0000397Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentERO_0000397Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentERO_0000397Iterator theStudentERO_0000397Iterator = (StudentERO_0000397Iterator)findAncestorWithClass(this, StudentERO_0000397Iterator.class);
			pageContext.getOut().print(theStudentERO_0000397Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

