package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeCurrencyIterator theStateOrProvince = (StateOrProvinceCodeCurrencyIterator)findAncestorWithClass(this, StateOrProvinceCodeCurrencyIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

