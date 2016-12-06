package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCountryAreaUnitIterator theStateOrProvince = (StateOrProvinceCountryAreaUnitIterator)findAncestorWithClass(this, StateOrProvinceCountryAreaUnitIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

