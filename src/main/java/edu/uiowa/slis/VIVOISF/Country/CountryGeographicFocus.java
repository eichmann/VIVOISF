package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryGeographicFocusIterator theCountryGeographicFocusIterator = (CountryGeographicFocusIterator)findAncestorWithClass(this, CountryGeographicFocusIterator.class);
			pageContext.getOut().print(theCountryGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

