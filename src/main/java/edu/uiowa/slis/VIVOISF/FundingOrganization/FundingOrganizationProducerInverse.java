package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationProducerInverseIterator theFundingOrganizationProducerInverseIterator = (FundingOrganizationProducerInverseIterator)findAncestorWithClass(this, FundingOrganizationProducerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for producer tag ");
		}
		return SKIP_BODY;
	}
}

