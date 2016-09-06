package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyAffiliatedOrganizationIterator theGovernmentAgencyAffiliatedOrganizationIterator = (GovernmentAgencyAffiliatedOrganizationIterator)findAncestorWithClass(this, GovernmentAgencyAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theGovernmentAgencyAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

