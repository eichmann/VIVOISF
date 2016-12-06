package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRO_0001015Iterator theNonFacultyAcademicPositionRO_0001015Iterator = (NonFacultyAcademicPositionRO_0001015Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionRO_0001015Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

