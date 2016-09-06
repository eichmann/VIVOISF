package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeISO3Iterator theCountry = (CountryCodeISO3Iterator)findAncestorWithClass(this, CountryCodeISO3Iterator.class);
			pageContext.getOut().print(theCountry.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

