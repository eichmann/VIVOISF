package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentEditorInverseIterator theStudentEditorInverseIterator = (StudentEditorInverseIterator)findAncestorWithClass(this, StudentEditorInverseIterator.class);
			pageContext.getOut().print(theStudentEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for editor tag ");
		}
		return SKIP_BODY;
	}
}

