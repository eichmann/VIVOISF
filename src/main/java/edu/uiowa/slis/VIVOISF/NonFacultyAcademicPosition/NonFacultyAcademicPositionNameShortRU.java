package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortRUIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortRUIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortRUIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

