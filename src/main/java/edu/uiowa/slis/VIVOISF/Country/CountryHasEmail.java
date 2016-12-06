package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasEmailIterator theCountryHasEmailIterator = (CountryHasEmailIterator)findAncestorWithClass(this, CountryHasEmailIterator.class);
			pageContext.getOut().print(theCountryHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

