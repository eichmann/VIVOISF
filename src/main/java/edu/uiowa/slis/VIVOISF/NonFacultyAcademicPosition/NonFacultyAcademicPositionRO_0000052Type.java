package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRO_0000052Iterator theNonFacultyAcademicPositionRO_0000052Iterator = (NonFacultyAcademicPositionRO_0000052Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionRO_0000052Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

