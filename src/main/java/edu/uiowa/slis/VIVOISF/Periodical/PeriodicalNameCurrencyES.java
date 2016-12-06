package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyESIterator thePeriodical = (PeriodicalNameCurrencyESIterator)findAncestorWithClass(this, PeriodicalNameCurrencyESIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

