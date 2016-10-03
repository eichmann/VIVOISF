package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentEditorInverseIterator theGraduateStudentEditorInverseIterator = (GraduateStudentEditorInverseIterator)findAncestorWithClass(this, GraduateStudentEditorInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for editor tag ");
		}
		return SKIP_BODY;
	}
}

