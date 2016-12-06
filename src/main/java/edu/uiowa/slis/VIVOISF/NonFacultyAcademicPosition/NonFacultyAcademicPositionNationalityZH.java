package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityZHIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityZHIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityZHIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

