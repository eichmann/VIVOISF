package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameCurrencyITIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameCurrencyITIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

