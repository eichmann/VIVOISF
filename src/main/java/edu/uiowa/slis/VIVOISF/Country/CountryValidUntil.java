package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryValidUntilIterator theCountry = (CountryValidUntilIterator)findAncestorWithClass(this, CountryValidUntilIterator.class);
			pageContext.getOut().print(theCountry.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

