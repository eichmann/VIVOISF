package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryAgriculturalAreaYearIterator theCountry = (CountryAgriculturalAreaYearIterator)findAncestorWithClass(this, CountryAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theCountry.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

