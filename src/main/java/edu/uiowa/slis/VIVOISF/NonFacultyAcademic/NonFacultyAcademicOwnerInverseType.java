package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicOwnerInverseIterator theNonFacultyAcademicOwnerInverseIterator = (NonFacultyAcademicOwnerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicOwnerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for owner tag ");
		}
		return SKIP_BODY;
	}
}

