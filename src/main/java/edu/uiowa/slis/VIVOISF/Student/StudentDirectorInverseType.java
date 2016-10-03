package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentDirectorInverseIterator theStudentDirectorInverseIterator = (StudentDirectorInverseIterator)findAncestorWithClass(this, StudentDirectorInverseIterator.class);
			pageContext.getOut().print(theStudentDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for director tag ");
		}
		return SKIP_BODY;
	}
}

