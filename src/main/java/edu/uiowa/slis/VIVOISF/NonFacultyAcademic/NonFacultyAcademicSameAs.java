package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicSameAsIterator theNonFacultyAcademic = (NonFacultyAcademicSameAsIterator)findAncestorWithClass(this, NonFacultyAcademicSameAsIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

