package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHDINotesIterator theGovernmentAgency = (GovernmentAgencyHDINotesIterator)findAncestorWithClass(this, GovernmentAgencyHDINotesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

