package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasBorderWithType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasBorderWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasBorderWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasBorderWithIterator theCountryHasBorderWithIterator = (CountryHasBorderWithIterator)findAncestorWithClass(this, CountryHasBorderWithIterator.class);
			pageContext.getOut().print(theCountryHasBorderWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

