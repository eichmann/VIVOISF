package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionCodeCurrencyIterator theFacultyPosition = (FacultyPositionCodeCurrencyIterator)findAncestorWithClass(this, FacultyPositionCodeCurrencyIterator.class);
			pageContext.getOut().print(theFacultyPosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

