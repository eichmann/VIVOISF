package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasNameIterator theNonFacultyAcademicPositionHasNameIterator = (NonFacultyAcademicPositionHasNameIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasNameIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

