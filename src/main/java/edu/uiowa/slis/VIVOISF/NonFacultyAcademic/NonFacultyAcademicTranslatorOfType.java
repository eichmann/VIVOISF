package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicTranslatorOfIterator theNonFacultyAcademicTranslatorOfIterator = (NonFacultyAcademicTranslatorOfIterator)findAncestorWithClass(this, NonFacultyAcademicTranslatorOfIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

