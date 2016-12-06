package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyENIterator theOrganization = (OrganizationNameCurrencyENIterator)findAncestorWithClass(this, OrganizationNameCurrencyENIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

