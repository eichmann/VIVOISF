package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasAddressIterator theCountryHasAddressIterator = (CountryHasAddressIterator)findAncestorWithClass(this, CountryHasAddressIterator.class);
			pageContext.getOut().print(theCountryHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

