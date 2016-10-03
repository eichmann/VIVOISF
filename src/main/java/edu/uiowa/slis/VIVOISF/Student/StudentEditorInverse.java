package edu.uiowa.slis.VIVOISF.Student;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentEditorInverseIterator theStudentEditorInverseIterator = (StudentEditorInverseIterator)findAncestorWithClass(this, StudentEditorInverseIterator.class);
			pageContext.getOut().print(theStudentEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Student for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Student for editor tag ");
		}
		return SKIP_BODY;
	}
}

