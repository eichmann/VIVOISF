package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRelatesIterator theNonFacultyAcademicPositionRelatesIterator = (NonFacultyAcademicPositionRelatesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionRelatesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for relates tag ");
		}
		return SKIP_BODY;
	}
}

