package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCountryAreaTotalIterator theeconomic_region = (economic_regionCountryAreaTotalIterator)findAncestorWithClass(this, economic_regionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theeconomic_region.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

