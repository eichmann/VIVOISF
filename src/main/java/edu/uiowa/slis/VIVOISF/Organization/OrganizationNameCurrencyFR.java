package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyFRIterator theOrganization = (OrganizationNameCurrencyFRIterator)findAncestorWithClass(this, OrganizationNameCurrencyFRIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

