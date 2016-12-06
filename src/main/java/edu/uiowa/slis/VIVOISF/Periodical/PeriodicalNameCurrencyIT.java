package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyITIterator thePeriodical = (PeriodicalNameCurrencyITIterator)findAncestorWithClass(this, PeriodicalNameCurrencyITIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

