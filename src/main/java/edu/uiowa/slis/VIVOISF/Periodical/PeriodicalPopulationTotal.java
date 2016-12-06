package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPopulationTotalIterator thePeriodical = (PeriodicalPopulationTotalIterator)findAncestorWithClass(this, PeriodicalPopulationTotalIterator.class);
			pageContext.getOut().print(thePeriodical.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

