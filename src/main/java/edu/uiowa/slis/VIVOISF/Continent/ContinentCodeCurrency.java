package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCodeCurrencyIterator theContinent = (ContinentCodeCurrencyIterator)findAncestorWithClass(this, ContinentCodeCurrencyIterator.class);
			pageContext.getOut().print(theContinent.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

