package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationERO_0000031Iterator theFundingOrganizationERO_0000031Iterator = (FundingOrganizationERO_0000031Iterator)findAncestorWithClass(this, FundingOrganizationERO_0000031Iterator.class);
			pageContext.getOut().print(theFundingOrganizationERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

