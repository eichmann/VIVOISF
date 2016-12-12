package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeCurrencyIterator theArea = (AreaCodeCurrencyIterator)findAncestorWithClass(this, AreaCodeCurrencyIterator.class);
			pageContext.getOut().print(theArea.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

