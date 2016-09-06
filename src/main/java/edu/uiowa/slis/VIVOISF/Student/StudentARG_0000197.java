package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StudentARG_0000197Iterator theStudent = (StudentARG_0000197Iterator)findAncestorWithClass(this, StudentARG_0000197Iterator.class);
			pageContext.getOut().print(theStudent.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

