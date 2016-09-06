package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNationalityARIterator theCountry = (CountryNationalityARIterator)findAncestorWithClass(this, CountryNationalityARIterator.class);
			pageContext.getOut().print(theCountry.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

