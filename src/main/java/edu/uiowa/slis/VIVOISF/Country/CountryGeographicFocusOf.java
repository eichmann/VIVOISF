package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryGeographicFocusOfIterator theCountry = (CountryGeographicFocusOfIterator)findAncestorWithClass(this, CountryGeographicFocusOfIterator.class);
			pageContext.getOut().print(theCountry.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

