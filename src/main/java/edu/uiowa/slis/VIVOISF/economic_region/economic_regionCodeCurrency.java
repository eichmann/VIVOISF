package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeCurrencyIterator theeconomic_region = (economic_regionCodeCurrencyIterator)findAncestorWithClass(this, economic_regionCodeCurrencyIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

