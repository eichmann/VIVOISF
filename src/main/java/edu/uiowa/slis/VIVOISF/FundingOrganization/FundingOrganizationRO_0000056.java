package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationRO_0000056Iterator theFundingOrganizationRO_0000056Iterator = (FundingOrganizationRO_0000056Iterator)findAncestorWithClass(this, FundingOrganizationRO_0000056Iterator.class);
			pageContext.getOut().print(theFundingOrganizationRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

