package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeUNIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeUNIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeUNIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

