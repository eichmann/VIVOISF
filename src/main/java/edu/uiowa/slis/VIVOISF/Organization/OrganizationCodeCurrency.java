package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationCodeCurrencyIterator theOrganization = (OrganizationCodeCurrencyIterator)findAncestorWithClass(this, OrganizationCodeCurrencyIterator.class);
			pageContext.getOut().print(theOrganization.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

