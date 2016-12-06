package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListESIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListESIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListESIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

