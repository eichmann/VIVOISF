package edu.uiowa.slis.VIVOISF.UndergraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UndergraduateStudentEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UndergraduateStudentEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(UndergraduateStudentEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UndergraduateStudentEditorInverseIterator theUndergraduateStudentEditorInverseIterator = (UndergraduateStudentEditorInverseIterator)findAncestorWithClass(this, UndergraduateStudentEditorInverseIterator.class);
			pageContext.getOut().print(theUndergraduateStudentEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing UndergraduateStudent for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing UndergraduateStudent for editor tag ");
		}
		return SKIP_BODY;
	}
}

