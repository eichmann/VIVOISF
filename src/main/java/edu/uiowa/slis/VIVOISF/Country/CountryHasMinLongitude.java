package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHasMinLongitudeIterator theCountry = (CountryHasMinLongitudeIterator)findAncestorWithClass(this, CountryHasMinLongitudeIterator.class);
			pageContext.getOut().print(theCountry.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

