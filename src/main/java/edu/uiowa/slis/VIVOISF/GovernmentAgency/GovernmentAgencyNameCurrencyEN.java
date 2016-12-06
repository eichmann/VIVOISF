package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyENIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyENIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyENIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

