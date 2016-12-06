package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameOfficialARIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameOfficialARIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameOfficialARIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

