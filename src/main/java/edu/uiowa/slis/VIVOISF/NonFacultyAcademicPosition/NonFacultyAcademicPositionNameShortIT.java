package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortITIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortITIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortITIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

