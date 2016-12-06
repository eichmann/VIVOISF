package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPopulationTotalIterator thePrimaryPosition = (PrimaryPositionPopulationTotalIterator)findAncestorWithClass(this, PrimaryPositionPopulationTotalIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

