package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListZHIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListZHIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListZHIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

