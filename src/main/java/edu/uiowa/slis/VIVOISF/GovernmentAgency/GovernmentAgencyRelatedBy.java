package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyRelatedByIterator theGovernmentAgencyRelatedByIterator = (GovernmentAgencyRelatedByIterator)findAncestorWithClass(this, GovernmentAgencyRelatedByIterator.class);
			pageContext.getOut().print(theGovernmentAgencyRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

