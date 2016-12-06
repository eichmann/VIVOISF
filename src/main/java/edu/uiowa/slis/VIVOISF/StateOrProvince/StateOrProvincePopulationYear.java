package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePopulationYearIterator theStateOrProvince = (StateOrProvincePopulationYearIterator)findAncestorWithClass(this, StateOrProvincePopulationYearIterator.class);
			pageContext.getOut().print(theStateOrProvince.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

