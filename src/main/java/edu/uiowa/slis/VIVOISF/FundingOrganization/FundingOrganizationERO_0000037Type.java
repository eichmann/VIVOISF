package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationERO_0000037Iterator theFundingOrganizationERO_0000037Iterator = (FundingOrganizationERO_0000037Iterator)findAncestorWithClass(this, FundingOrganizationERO_0000037Iterator.class);
			pageContext.getOut().print(theFundingOrganizationERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

