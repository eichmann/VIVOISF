package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicRO_0001025Iterator theNonFacultyAcademicRO_0001025Iterator = (NonFacultyAcademicRO_0001025Iterator)findAncestorWithClass(this, NonFacultyAcademicRO_0001025Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

