package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyHasPublicationVenueIterator theCompanyHasPublicationVenueIterator = (CompanyHasPublicationVenueIterator)findAncestorWithClass(this, CompanyHasPublicationVenueIterator.class);
			pageContext.getOut().print(theCompanyHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

