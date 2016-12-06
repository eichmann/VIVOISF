package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionARG_2000028Iterator theNonFacultyAcademicPositionARG_2000028Iterator = (NonFacultyAcademicPositionARG_2000028Iterator)findAncestorWithClass(this, NonFacultyAcademicPositionARG_2000028Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

