package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GraduateStudentEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GraduateStudentEditorInverseIterator theGraduateStudentEditorInverseIterator = (GraduateStudentEditorInverseIterator)findAncestorWithClass(this, GraduateStudentEditorInverseIterator.class);
			pageContext.getOut().print(theGraduateStudentEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GraduateStudent for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GraduateStudent for editor tag ");
		}
		return SKIP_BODY;
	}
}

