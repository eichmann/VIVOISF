package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyNameCurrencyARIterator theGovernmentAgency = (GovernmentAgencyNameCurrencyARIterator)findAncestorWithClass(this, GovernmentAgencyNameCurrencyARIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

