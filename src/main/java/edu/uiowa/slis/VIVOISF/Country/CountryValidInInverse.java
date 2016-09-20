package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryValidInInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryValidInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryValidInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryValidInInverseIterator theCountryValidInInverseIterator = (CountryValidInInverseIterator)findAncestorWithClass(this, CountryValidInInverseIterator.class);
			pageContext.getOut().print(theCountryValidInInverseIterator.getValidInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for validIn tag ");
		}
		return SKIP_BODY;
	}
}

