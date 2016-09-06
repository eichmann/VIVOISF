package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicGeographicFocusIterator theNonFacultyAcademicGeographicFocusIterator = (NonFacultyAcademicGeographicFocusIterator)findAncestorWithClass(this, NonFacultyAcademicGeographicFocusIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

