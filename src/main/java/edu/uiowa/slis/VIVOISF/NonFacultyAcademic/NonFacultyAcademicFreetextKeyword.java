package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicFreetextKeywordIterator theNonFacultyAcademic = (NonFacultyAcademicFreetextKeywordIterator)findAncestorWithClass(this, NonFacultyAcademicFreetextKeywordIterator.class);
			pageContext.getOut().print(theNonFacultyAcademic.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

