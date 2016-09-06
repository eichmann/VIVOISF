package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicRO_0000056Iterator theNonFacultyAcademicRO_0000056Iterator = (NonFacultyAcademicRO_0000056Iterator)findAncestorWithClass(this, NonFacultyAcademicRO_0000056Iterator.class);
			pageContext.getOut().print(theNonFacultyAcademicRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

