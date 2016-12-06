package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCountryAreaYearIterator theGovernmentAgency = (GovernmentAgencyCountryAreaYearIterator)findAncestorWithClass(this, GovernmentAgencyCountryAreaYearIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

