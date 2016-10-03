package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentPerformerInverseIterator theStudentPerformerInverseIterator = (StudentPerformerInverseIterator)findAncestorWithClass(this, StudentPerformerInverseIterator.class);
			pageContext.getOut().print(theStudentPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for performer tag ");
		}
		return SKIP_BODY;
	}
}

