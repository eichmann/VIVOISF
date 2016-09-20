package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasBorderWithInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasBorderWithInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasBorderWithInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasBorderWithInverseIterator theCountryHasBorderWithInverseIterator = (CountryHasBorderWithInverseIterator)findAncestorWithClass(this, CountryHasBorderWithInverseIterator.class);
			pageContext.getOut().print(theCountryHasBorderWithInverseIterator.getHasBorderWithInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

