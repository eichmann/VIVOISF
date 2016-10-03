package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRecipientInverseIterator theGovernmentAgencyRecipientInverseIterator = (GovernmentAgencyRecipientInverseIterator)findAncestorWithClass(this, GovernmentAgencyRecipientInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for recipient tag ");
		}
		return SKIP_BODY;
	}
}

