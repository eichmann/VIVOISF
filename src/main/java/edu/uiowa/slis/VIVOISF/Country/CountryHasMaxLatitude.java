package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHasMaxLatitudeIterator theCountry = (CountryHasMaxLatitudeIterator)findAncestorWithClass(this, CountryHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theCountry.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

