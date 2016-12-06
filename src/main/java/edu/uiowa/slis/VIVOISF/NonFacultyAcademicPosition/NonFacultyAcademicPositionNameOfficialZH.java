package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameOfficialZHIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameOfficialZHIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameOfficialZHIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

