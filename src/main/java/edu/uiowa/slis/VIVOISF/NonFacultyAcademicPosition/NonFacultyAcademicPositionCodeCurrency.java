package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCodeCurrencyIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCodeCurrencyIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCodeCurrencyIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

