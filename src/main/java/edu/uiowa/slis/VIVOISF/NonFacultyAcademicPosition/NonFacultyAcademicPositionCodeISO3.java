package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeISO3Iterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeISO3Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeISO3Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

