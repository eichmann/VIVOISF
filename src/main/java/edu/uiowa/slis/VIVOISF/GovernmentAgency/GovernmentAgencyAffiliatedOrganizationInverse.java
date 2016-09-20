package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAffiliatedOrganizationInverseIterator theGovernmentAgencyAffiliatedOrganizationInverseIterator = (GovernmentAgencyAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, GovernmentAgencyAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theGovernmentAgencyAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

