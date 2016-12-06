package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyPublicationVenueForIterator theCompanyPublicationVenueForIterator = (CompanyPublicationVenueForIterator)findAncestorWithClass(this, CompanyPublicationVenueForIterator.class);
			pageContext.getOut().print(theCompanyPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

