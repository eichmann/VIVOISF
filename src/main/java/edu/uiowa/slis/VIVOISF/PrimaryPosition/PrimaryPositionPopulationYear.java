package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPopulationYearIterator thePrimaryPosition = (PrimaryPositionPopulationYearIterator)findAncestorWithClass(this, PrimaryPositionPopulationYearIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

