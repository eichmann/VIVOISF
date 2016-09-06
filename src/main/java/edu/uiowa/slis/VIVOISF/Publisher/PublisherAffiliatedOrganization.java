package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherAffiliatedOrganizationIterator thePublisherAffiliatedOrganizationIterator = (PublisherAffiliatedOrganizationIterator)findAncestorWithClass(this, PublisherAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(thePublisherAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

