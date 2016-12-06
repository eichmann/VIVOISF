package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCountryAreaYearIterator theeconomic_region = (economic_regionCountryAreaYearIterator)findAncestorWithClass(this, economic_regionCountryAreaYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

