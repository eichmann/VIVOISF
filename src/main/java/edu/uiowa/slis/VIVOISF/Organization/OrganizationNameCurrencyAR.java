package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameCurrencyARIterator theOrganization = (OrganizationNameCurrencyARIterator)findAncestorWithClass(this, OrganizationNameCurrencyARIterator.class);
			pageContext.getOut().print(theOrganization.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

