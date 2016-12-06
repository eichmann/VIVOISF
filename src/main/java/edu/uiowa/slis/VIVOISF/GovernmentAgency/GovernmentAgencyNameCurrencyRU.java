package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyRUIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyRUIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyRUIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

