package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyENIterator thePeriodical = (PeriodicalNameCurrencyENIterator)findAncestorWithClass(this, PeriodicalNameCurrencyENIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

