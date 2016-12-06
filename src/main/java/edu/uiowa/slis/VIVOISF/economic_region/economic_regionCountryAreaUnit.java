package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCountryAreaUnitIterator theeconomic_region = (economic_regionCountryAreaUnitIterator)findAncestorWithClass(this, economic_regionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theeconomic_region.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

