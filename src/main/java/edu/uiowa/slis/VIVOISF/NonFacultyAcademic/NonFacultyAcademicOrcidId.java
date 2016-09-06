package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicOrcidId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicOrcidId currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicOrcidId.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicOrcidIdIterator theNonFacultyAcademicOrcidIdIterator = (NonFacultyAcademicOrcidIdIterator)findAncestorWithClass(this, NonFacultyAcademicOrcidIdIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicOrcidIdIterator.getOrcidId());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

