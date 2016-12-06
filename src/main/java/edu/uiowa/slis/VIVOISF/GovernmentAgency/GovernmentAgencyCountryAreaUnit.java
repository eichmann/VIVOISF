package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyCountryAreaUnitIterator theGovernmentAgency = (GovernmentAgencyCountryAreaUnitIterator)findAncestorWithClass(this, GovernmentAgencyCountryAreaUnitIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

