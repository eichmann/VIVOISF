package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicEditorInverseIterator theNonFacultyAcademicEditorInverseIterator = (NonFacultyAcademicEditorInverseIterator)findAncestorWithClass(this, NonFacultyAcademicEditorInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for editor tag ");
		}
		return SKIP_BODY;
	}
}

