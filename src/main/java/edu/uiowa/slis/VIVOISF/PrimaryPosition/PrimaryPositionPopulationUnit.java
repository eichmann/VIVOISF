package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionPopulationUnitIterator thePrimaryPosition = (PrimaryPositionPopulationUnitIterator)findAncestorWithClass(this, PrimaryPositionPopulationUnitIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

