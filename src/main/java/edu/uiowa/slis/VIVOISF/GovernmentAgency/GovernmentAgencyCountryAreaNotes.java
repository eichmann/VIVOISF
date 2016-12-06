package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCountryAreaNotesIterator theGovernmentAgency = (GovernmentAgencyCountryAreaNotesIterator)findAncestorWithClass(this, GovernmentAgencyCountryAreaNotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

