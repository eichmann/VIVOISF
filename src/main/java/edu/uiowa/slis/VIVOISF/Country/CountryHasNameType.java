package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasNameIterator theCountryHasNameIterator = (CountryHasNameIterator)findAncestorWithClass(this, CountryHasNameIterator.class);
			pageContext.getOut().print(theCountryHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasName tag ");
		}
		return SKIP_BODY;
	}
}

