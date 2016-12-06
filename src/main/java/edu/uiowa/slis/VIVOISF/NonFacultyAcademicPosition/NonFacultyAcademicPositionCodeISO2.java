package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeISO2Iterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeISO2Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeISO2Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

