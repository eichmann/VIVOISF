package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPopulationUnitIterator thePeriodical = (PeriodicalPopulationUnitIterator)findAncestorWithClass(this, PeriodicalPopulationUnitIterator.class);
			pageContext.getOut().print(thePeriodical.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

