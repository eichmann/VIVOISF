package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionCodeCurrencyIterator theNonAcademicPosition = (NonAcademicPositionCodeCurrencyIterator)findAncestorWithClass(this, NonAcademicPositionCodeCurrencyIterator.class);
			pageContext.getOut().print(theNonAcademicPosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

