package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyFRIterator thePeriodical = (PeriodicalNameCurrencyFRIterator)findAncestorWithClass(this, PeriodicalNameCurrencyFRIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

