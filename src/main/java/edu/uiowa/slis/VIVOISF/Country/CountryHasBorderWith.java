package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasBorderWith extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasBorderWith currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasBorderWith.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasBorderWithIterator theCountryHasBorderWithIterator = (CountryHasBorderWithIterator)findAncestorWithClass(this, CountryHasBorderWithIterator.class);
			pageContext.getOut().print(theCountryHasBorderWithIterator.getHasBorderWith());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

