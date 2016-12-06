package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameCurrencyESIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameCurrencyESIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

