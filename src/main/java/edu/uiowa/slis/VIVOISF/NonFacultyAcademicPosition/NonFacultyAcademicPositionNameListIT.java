package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListITIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListITIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListITIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

