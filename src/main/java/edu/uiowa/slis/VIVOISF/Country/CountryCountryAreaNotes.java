package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCountryAreaNotesIterator theCountry = (CountryCountryAreaNotesIterator)findAncestorWithClass(this, CountryCountryAreaNotesIterator.class);
			pageContext.getOut().print(theCountry.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

