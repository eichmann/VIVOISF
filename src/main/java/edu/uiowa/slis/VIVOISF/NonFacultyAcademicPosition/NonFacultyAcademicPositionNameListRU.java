package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListRUIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListRUIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListRUIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

