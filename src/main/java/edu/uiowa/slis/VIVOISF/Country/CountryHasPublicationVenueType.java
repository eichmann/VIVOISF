package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasPublicationVenueIterator theCountryHasPublicationVenueIterator = (CountryHasPublicationVenueIterator)findAncestorWithClass(this, CountryHasPublicationVenueIterator.class);
			pageContext.getOut().print(theCountryHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

