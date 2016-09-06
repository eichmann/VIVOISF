package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicERACommonsIdIterator theNonFacultyAcademic = (NonFacultyAcademicERACommonsIdIterator)findAncestorWithClass(this, NonFacultyAcademicERACommonsIdIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

