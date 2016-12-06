package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionUrlIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionUrlIterator)findAncestorWithClass(this, NonFacultyAcademicPositionUrlIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for url tag ");
		}
		return SKIP_BODY;
	}
}

