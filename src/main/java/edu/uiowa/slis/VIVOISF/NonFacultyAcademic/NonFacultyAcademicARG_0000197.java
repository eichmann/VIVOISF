package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicARG_0000197Iterator theNonFacultyAcademic = (NonFacultyAcademicARG_0000197Iterator)findAncestorWithClass(this, NonFacultyAcademicARG_0000197Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

