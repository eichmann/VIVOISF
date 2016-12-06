package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortESIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortESIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortESIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

