package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortARIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortARIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortARIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

