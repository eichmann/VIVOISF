package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCodeCurrencyIterator theterritory = (territoryCodeCurrencyIterator)findAncestorWithClass(this, territoryCodeCurrencyIterator.class);
			pageContext.getOut().print(theterritory.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

