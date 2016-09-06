package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationPublisherOfIterator theFundingOrganizationPublisherOfIterator = (FundingOrganizationPublisherOfIterator)findAncestorWithClass(this, FundingOrganizationPublisherOfIterator.class);
			pageContext.getOut().print(theFundingOrganizationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

