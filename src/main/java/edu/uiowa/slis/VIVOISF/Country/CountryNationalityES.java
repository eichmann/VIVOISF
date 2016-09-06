package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityESIterator theCountry = (CountryNationalityESIterator)findAncestorWithClass(this, CountryNationalityESIterator.class);
			pageContext.getOut().print(theCountry.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

