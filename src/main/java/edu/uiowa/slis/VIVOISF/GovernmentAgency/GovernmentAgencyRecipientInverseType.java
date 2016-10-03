package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRecipientInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRecipientInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRecipientInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRecipientInverseIterator theGovernmentAgencyRecipientInverseIterator = (GovernmentAgencyRecipientInverseIterator)findAncestorWithClass(this, GovernmentAgencyRecipientInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyRecipientInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for recipient tag ");
		}
		return SKIP_BODY;
	}
}

