package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPopulationNotesIterator theGovernmentAgency = (GovernmentAgencyPopulationNotesIterator)findAncestorWithClass(this, GovernmentAgencyPopulationNotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

