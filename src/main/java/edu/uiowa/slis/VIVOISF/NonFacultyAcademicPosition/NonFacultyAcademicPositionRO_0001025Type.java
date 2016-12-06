package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRO_0001025Iterator theNonFacultyAcademicPositionRO_0001025Iterator = (NonFacultyAcademicPositionRO_0001025Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionRO_0001025Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

