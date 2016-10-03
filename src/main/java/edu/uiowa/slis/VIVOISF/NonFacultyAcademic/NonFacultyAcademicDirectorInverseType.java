package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicDirectorInverseIterator theNonFacultyAcademicDirectorInverseIterator = (NonFacultyAcademicDirectorInverseIterator)findAncestorWithClass(this, NonFacultyAcademicDirectorInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for director tag ");
		}
		return SKIP_BODY;
	}
}

