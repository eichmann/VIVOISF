package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCountryAreaTotalIterator theStateOrProvince = (StateOrProvinceCountryAreaTotalIterator)findAncestorWithClass(this, StateOrProvinceCountryAreaTotalIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

