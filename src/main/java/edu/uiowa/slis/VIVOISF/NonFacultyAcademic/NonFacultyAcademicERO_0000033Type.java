package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicERO_0000033Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicERO_0000033Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicERO_0000033Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicERO_0000033Iterator theNonFacultyAcademicERO_0000033Iterator = (NonFacultyAcademicERO_0000033Iterator)findAncestorWithClass(this, NonFacultyAcademicERO_0000033Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicERO_0000033Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

