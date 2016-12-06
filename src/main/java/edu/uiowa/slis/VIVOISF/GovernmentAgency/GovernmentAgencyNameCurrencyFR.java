package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyFRIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyFRIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyFRIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

