package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameOfficialESIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameOfficialESIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameOfficialESIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

