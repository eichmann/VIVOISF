package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeCurrencyIterator theself_governing = (self_governingCodeCurrencyIterator)findAncestorWithClass(this, self_governingCodeCurrencyIterator.class);
			pageContext.getOut().print(theself_governing.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

