package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionCodeCurrencyIterator theFacultyAdministrativePosition = (FacultyAdministrativePositionCodeCurrencyIterator)findAncestorWithClass(this, FacultyAdministrativePositionCodeCurrencyIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

