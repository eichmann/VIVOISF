package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePopulationTotalIterator theStateOrProvince = (StateOrProvincePopulationTotalIterator)findAncestorWithClass(this, StateOrProvincePopulationTotalIterator.class);
			pageContext.getOut().print(theStateOrProvince.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

