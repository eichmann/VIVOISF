package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHasMaxLongitudeIterator theCountry = (CountryHasMaxLongitudeIterator)findAncestorWithClass(this, CountryHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theCountry.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

