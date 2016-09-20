package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicERO_0000397 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicERO_0000397 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicERO_0000397.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicERO_0000397Iterator theNonFacultyAcademicERO_0000397Iterator = (NonFacultyAcademicERO_0000397Iterator)findAncestorWithClass(this, NonFacultyAcademicERO_0000397Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicERO_0000397Iterator.getERO_0000397());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for ERO_0000397 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for ERO_0000397 tag ");
		}
		return SKIP_BODY;
	}
}

