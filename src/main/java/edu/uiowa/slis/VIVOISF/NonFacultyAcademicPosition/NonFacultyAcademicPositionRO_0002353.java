package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRO_0002353Iterator theNonFacultyAcademicPositionRO_0002353Iterator = (NonFacultyAcademicPositionRO_0002353Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionRO_0002353Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

