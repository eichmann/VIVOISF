package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCodeCurrencyIterator thePeriodical = (PeriodicalCodeCurrencyIterator)findAncestorWithClass(this, PeriodicalCodeCurrencyIterator.class);
			pageContext.getOut().print(thePeriodical.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

