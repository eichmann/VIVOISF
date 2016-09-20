package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherAffiliatedOrganizationInverseIterator thePublisherAffiliatedOrganizationInverseIterator = (PublisherAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, PublisherAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(thePublisherAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

