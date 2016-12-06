package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameListENIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameListENIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameListENIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

