package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationTranslatorOfIterator theFundingOrganizationTranslatorOfIterator = (FundingOrganizationTranslatorOfIterator)findAncestorWithClass(this, FundingOrganizationTranslatorOfIterator.class);
			pageContext.getOut().print(theFundingOrganizationTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

