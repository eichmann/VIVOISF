package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeISO2Iterator theCountry = (CountryCodeISO2Iterator)findAncestorWithClass(this, CountryCodeISO2Iterator.class);
			pageContext.getOut().print(theCountry.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

