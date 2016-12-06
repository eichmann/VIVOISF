package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionBFO_0000050Iterator theNonFacultyAcademicPositionBFO_0000050Iterator = (NonFacultyAcademicPositionBFO_0000050Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionBFO_0000050Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

