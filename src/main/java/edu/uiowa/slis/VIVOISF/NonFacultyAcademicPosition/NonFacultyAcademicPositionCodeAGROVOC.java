package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeAGROVOCIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeAGROVOCIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeAGROVOCIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

