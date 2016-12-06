package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyZHIterator theOrganization = (OrganizationNameCurrencyZHIterator)findAncestorWithClass(this, OrganizationNameCurrencyZHIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

