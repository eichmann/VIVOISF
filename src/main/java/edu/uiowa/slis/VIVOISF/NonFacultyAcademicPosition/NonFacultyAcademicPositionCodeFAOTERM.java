package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeFAOTERMIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeFAOTERMIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

