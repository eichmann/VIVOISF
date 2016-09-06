package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicScopusId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicScopusId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicScopusId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicScopusIdIterator theNonFacultyAcademic = (NonFacultyAcademicScopusIdIterator)findAncestorWithClass(this, NonFacultyAcademicScopusIdIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getScopusId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for scopusId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for scopusId tag ");
		}
		return SKIP_BODY;
	}
}

