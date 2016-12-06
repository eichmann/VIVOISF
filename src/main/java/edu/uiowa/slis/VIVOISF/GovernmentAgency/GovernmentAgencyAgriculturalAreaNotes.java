package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAgriculturalAreaNotesIterator theGovernmentAgency = (GovernmentAgencyAgriculturalAreaNotesIterator)findAncestorWithClass(this, GovernmentAgencyAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

