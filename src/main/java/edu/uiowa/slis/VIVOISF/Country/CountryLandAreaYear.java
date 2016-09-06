package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryLandAreaYearIterator theCountry = (CountryLandAreaYearIterator)findAncestorWithClass(this, CountryLandAreaYearIterator.class);
			pageContext.getOut().print(theCountry.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

