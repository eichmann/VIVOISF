package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHDIYearIterator theCountry = (CountryHDIYearIterator)findAncestorWithClass(this, CountryHDIYearIterator.class);
			pageContext.getOut().print(theCountry.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

