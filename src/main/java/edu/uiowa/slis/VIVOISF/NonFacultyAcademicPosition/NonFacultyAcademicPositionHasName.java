package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasNameIterator theNonFacultyAcademicPositionHasNameIterator = (NonFacultyAcademicPositionHasNameIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasNameIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasName tag ");
		}
		return SKIP_BODY;
	}
}

