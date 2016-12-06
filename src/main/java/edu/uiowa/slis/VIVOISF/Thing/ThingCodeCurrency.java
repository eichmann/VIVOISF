package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeCurrencyIterator theThing = (ThingCodeCurrencyIterator)findAncestorWithClass(this, ThingCodeCurrencyIterator.class);
			pageContext.getOut().print(theThing.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

