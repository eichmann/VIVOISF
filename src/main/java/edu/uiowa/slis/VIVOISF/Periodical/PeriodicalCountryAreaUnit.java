package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCountryAreaUnitIterator thePeriodical = (PeriodicalCountryAreaUnitIterator)findAncestorWithClass(this, PeriodicalCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePeriodical.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

