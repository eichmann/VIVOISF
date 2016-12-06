package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCodeCurrencyIterator theGovernmentAgency = (GovernmentAgencyCodeCurrencyIterator)findAncestorWithClass(this, GovernmentAgencyCodeCurrencyIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

