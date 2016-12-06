package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameOfficialFRIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameOfficialFRIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameOfficialFRIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

