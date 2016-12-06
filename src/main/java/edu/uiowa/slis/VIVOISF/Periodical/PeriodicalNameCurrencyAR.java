package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalNameCurrencyARIterator thePeriodical = (PeriodicalNameCurrencyARIterator)findAncestorWithClass(this, PeriodicalNameCurrencyARIterator.class);
			pageContext.getOut().print(thePeriodical.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

