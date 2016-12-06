package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeFAOSTATIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeFAOSTATIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

