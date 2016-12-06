package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGDPNotesIterator theGovernmentAgency = (GovernmentAgencyGDPNotesIterator)findAncestorWithClass(this, GovernmentAgencyGDPNotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

