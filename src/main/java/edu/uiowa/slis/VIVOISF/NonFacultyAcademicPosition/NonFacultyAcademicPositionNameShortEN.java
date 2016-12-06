package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameShortENIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameShortENIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameShortENIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

