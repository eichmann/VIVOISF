package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyZHIterator thePeriodical = (PeriodicalNameCurrencyZHIterator)findAncestorWithClass(this, PeriodicalNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

