package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasEmailIterator theNonFacultyAcademicPositionHasEmailIterator = (NonFacultyAcademicPositionHasEmailIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasEmailIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

