package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicRelatedByIterator theNonFacultyAcademicRelatedByIterator = (NonFacultyAcademicRelatedByIterator)findAncestorWithClass(this, NonFacultyAcademicRelatedByIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

