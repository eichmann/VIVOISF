package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityFRIterator theCountry = (CountryNationalityFRIterator)findAncestorWithClass(this, CountryNationalityFRIterator.class);
			pageContext.getOut().print(theCountry.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

