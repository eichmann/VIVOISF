package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyESIterator theOrganization = (OrganizationNameCurrencyESIterator)findAncestorWithClass(this, OrganizationNameCurrencyESIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

