package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameOfficialITIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameOfficialITIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameOfficialITIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

