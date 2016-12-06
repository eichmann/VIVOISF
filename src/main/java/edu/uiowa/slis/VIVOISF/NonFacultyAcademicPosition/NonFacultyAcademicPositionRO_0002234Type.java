package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRO_0002234Iterator theNonFacultyAcademicPositionRO_0002234Iterator = (NonFacultyAcademicPositionRO_0002234Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionRO_0002234Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

