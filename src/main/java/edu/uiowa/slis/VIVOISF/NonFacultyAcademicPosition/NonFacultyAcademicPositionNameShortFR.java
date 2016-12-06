package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortFRIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortFRIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortFRIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

