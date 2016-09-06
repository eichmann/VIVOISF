package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryValidSinceIterator theCountry = (CountryValidSinceIterator)findAncestorWithClass(this, CountryValidSinceIterator.class);
			pageContext.getOut().print(theCountry.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for validSince tag ");
		}
		return SKIP_BODY;
	}
}

