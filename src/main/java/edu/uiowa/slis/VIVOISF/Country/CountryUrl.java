package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryUrlIterator theCountry = (CountryUrlIterator)findAncestorWithClass(this, CountryUrlIterator.class);
			pageContext.getOut().print(theCountry.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for url tag ");
		}
		return SKIP_BODY;
	}
}

