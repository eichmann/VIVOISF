package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeCurrencyIterator thegeographical_region = (geographical_regionCodeCurrencyIterator)findAncestorWithClass(this, geographical_regionCodeCurrencyIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

