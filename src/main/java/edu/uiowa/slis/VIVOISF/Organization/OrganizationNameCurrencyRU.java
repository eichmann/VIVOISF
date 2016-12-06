package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyRUIterator theOrganization = (OrganizationNameCurrencyRUIterator)findAncestorWithClass(this, OrganizationNameCurrencyRUIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

