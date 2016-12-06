package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyITIterator theOrganization = (OrganizationNameCurrencyITIterator)findAncestorWithClass(this, OrganizationNameCurrencyITIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

