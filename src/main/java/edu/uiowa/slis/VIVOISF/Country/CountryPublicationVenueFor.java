package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryPublicationVenueForIterator theCountryPublicationVenueForIterator = (CountryPublicationVenueForIterator)findAncestorWithClass(this, CountryPublicationVenueForIterator.class);
			pageContext.getOut().print(theCountryPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

