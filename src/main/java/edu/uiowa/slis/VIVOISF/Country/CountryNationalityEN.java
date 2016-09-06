package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityENIterator theCountry = (CountryNationalityENIterator)findAncestorWithClass(this, CountryNationalityENIterator.class);
			pageContext.getOut().print(theCountry.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

