package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryGDPYearIterator theCountry = (CountryGDPYearIterator)findAncestorWithClass(this, CountryGDPYearIterator.class);
			pageContext.getOut().print(theCountry.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

