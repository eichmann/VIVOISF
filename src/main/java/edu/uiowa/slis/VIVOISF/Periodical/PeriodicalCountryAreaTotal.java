package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalCountryAreaTotalIterator thePeriodical = (PeriodicalCountryAreaTotalIterator)findAncestorWithClass(this, PeriodicalCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePeriodical.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

