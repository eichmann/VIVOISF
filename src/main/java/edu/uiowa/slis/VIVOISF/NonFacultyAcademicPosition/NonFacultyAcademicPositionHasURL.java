package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasURLIterator theNonFacultyAcademicPositionHasURLIterator = (NonFacultyAcademicPositionHasURLIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasURLIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

