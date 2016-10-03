package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentEditorInverseIterator theAcademicDepartmentEditorInverseIterator = (AcademicDepartmentEditorInverseIterator)findAncestorWithClass(this, AcademicDepartmentEditorInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for editor tag ");
		}
		return SKIP_BODY;
	}
}

