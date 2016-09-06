package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHasMinLatitudeIterator theCountry = (CountryHasMinLatitudeIterator)findAncestorWithClass(this, CountryHasMinLatitudeIterator.class);
			pageContext.getOut().print(theCountry.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

