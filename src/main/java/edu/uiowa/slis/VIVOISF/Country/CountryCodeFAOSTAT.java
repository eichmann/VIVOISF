package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeFAOSTATIterator theCountry = (CountryCodeFAOSTATIterator)findAncestorWithClass(this, CountryCodeFAOSTATIterator.class);
			pageContext.getOut().print(theCountry.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

