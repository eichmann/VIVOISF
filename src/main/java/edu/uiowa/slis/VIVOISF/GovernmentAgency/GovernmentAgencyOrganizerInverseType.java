package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyOrganizerInverseIterator theGovernmentAgencyOrganizerInverseIterator = (GovernmentAgencyOrganizerInverseIterator)findAncestorWithClass(this, GovernmentAgencyOrganizerInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for organizer tag ");
		}
		return SKIP_BODY;
	}
}

