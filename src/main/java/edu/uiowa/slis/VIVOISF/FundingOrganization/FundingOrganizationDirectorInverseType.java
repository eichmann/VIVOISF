package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationDirectorInverseIterator theFundingOrganizationDirectorInverseIterator = (FundingOrganizationDirectorInverseIterator)findAncestorWithClass(this, FundingOrganizationDirectorInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for director tag ");
		}
		return SKIP_BODY;
	}
}

