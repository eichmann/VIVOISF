package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicARG_2000028Iterator theNonFacultyAcademicARG_2000028Iterator = (NonFacultyAcademicARG_2000028Iterator)findAncestorWithClass(this, NonFacultyAcademicARG_2000028Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

