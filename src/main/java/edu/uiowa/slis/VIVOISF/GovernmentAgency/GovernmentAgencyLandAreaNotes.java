package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyLandAreaNotesIterator theGovernmentAgency = (GovernmentAgencyLandAreaNotesIterator)findAncestorWithClass(this, GovernmentAgencyLandAreaNotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

