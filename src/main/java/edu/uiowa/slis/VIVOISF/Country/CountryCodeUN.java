package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeUNIterator theCountry = (CountryCodeUNIterator)findAncestorWithClass(this, CountryCodeUNIterator.class);
			pageContext.getOut().print(theCountry.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

