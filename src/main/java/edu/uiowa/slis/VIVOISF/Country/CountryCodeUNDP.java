package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeUNDPIterator theCountry = (CountryCodeUNDPIterator)findAncestorWithClass(this, CountryCodeUNDPIterator.class);
			pageContext.getOut().print(theCountry.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

