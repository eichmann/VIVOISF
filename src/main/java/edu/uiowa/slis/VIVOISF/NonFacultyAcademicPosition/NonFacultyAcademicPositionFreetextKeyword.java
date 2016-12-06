package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionFreetextKeywordIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionFreetextKeywordIterator)findAncestorWithClass(this, NonFacultyAcademicPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}
