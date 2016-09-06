package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationRO_0000053Iterator theFundingOrganizationRO_0000053Iterator = (FundingOrganizationRO_0000053Iterator)findAncestorWithClass(this, FundingOrganizationRO_0000053Iterator.class);
			pageContext.getOut().print(theFundingOrganizationRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

