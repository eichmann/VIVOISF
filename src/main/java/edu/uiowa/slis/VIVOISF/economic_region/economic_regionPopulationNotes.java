package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionPopulationNotesIterator theeconomic_region = (economic_regionPopulationNotesIterator)findAncestorWithClass(this, economic_regionPopulationNotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

