package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityRUIterator theCountry = (CountryNationalityRUIterator)findAncestorWithClass(this, CountryNationalityRUIterator.class);
			pageContext.getOut().print(theCountry.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

