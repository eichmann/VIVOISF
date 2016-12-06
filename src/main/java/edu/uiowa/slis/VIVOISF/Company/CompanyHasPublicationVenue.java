package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasPublicationVenueIterator theCompanyHasPublicationVenueIterator = (CompanyHasPublicationVenueIterator)findAncestorWithClass(this, CompanyHasPublicationVenueIterator.class);
			pageContext.getOut().print(theCompanyHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

