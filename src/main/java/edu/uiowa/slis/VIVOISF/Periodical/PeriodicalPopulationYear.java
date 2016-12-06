package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPopulationYearIterator thePeriodical = (PeriodicalPopulationYearIterator)findAncestorWithClass(this, PeriodicalPopulationYearIterator.class);
			pageContext.getOut().print(thePeriodical.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

