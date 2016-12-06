package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListARIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListARIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListARIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

