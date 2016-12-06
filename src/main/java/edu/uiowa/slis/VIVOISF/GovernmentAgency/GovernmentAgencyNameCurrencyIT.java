package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyITIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyITIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyITIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

