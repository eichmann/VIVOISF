package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNameCurrencyFRIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNameCurrencyFRIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

