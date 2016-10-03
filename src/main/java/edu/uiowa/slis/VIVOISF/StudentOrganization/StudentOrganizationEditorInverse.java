package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationEditorInverseIterator theStudentOrganizationEditorInverseIterator = (StudentOrganizationEditorInverseIterator)findAncestorWithClass(this, StudentOrganizationEditorInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for editor tag ");
		}
		return SKIP_BODY;
	}
}

