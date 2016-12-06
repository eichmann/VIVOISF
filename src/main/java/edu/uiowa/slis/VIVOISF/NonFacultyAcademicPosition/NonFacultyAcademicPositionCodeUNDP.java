package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeUNDPIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeUNDPIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeUNDPIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

