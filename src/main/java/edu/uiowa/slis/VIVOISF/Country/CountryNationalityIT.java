package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityITIterator theCountry = (CountryNationalityITIterator)findAncestorWithClass(this, CountryNationalityITIterator.class);
			pageContext.getOut().print(theCountry.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

