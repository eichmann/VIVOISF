package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicRO_0000053Iterator theNonFacultyAcademicRO_0000053Iterator = (NonFacultyAcademicRO_0000053Iterator)findAncestorWithClass(this, NonFacultyAcademicRO_0000053Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

