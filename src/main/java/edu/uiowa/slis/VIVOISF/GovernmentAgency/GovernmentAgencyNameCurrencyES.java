package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyESIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyESIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyESIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

