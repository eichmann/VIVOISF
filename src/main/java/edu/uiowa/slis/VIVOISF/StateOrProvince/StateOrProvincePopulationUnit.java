package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvincePopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvincePopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvincePopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvincePopulationUnitIterator theStateOrProvince = (StateOrProvincePopulationUnitIterator)findAncestorWithClass(this, StateOrProvincePopulationUnitIterator.class);
			pageContext.getOut().print(theStateOrProvince.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

