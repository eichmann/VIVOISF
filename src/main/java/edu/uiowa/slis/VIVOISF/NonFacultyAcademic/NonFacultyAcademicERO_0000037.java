package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicERO_0000037 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicERO_0000037 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicERO_0000037.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicERO_0000037Iterator theNonFacultyAcademicERO_0000037Iterator = (NonFacultyAcademicERO_0000037Iterator)findAncestorWithClass(this, NonFacultyAcademicERO_0000037Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicERO_0000037Iterator.getERO_0000037());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

