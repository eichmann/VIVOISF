package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCountryAreaTotalIterator theGovernmentAgency = (GovernmentAgencyCountryAreaTotalIterator)findAncestorWithClass(this, GovernmentAgencyCountryAreaTotalIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

