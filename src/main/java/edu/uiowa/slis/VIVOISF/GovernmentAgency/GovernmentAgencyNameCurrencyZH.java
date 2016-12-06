package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyZHIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyZHIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyZHIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

