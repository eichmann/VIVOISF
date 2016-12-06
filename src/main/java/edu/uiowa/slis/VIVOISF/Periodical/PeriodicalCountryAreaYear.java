package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCountryAreaYearIterator thePeriodical = (PeriodicalCountryAreaYearIterator)findAncestorWithClass(this, PeriodicalCountryAreaYearIterator.class);
			pageContext.getOut().print(thePeriodical.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

