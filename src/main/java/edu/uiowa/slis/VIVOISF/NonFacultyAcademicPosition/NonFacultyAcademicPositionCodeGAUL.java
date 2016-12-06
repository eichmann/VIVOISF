package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeGAULIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeGAULIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeGAULIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

