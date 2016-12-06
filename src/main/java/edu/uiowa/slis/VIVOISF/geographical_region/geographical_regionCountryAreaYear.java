package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCountryAreaYearIterator thegeographical_region = (geographical_regionCountryAreaYearIterator)findAncestorWithClass(this, geographical_regionCountryAreaYearIterator.class);
			pageContext.getOut().print(thegeographical_region.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

