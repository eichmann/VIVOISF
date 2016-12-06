package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionPopulationTotalIterator theeconomic_region = (economic_regionPopulationTotalIterator)findAncestorWithClass(this, economic_regionPopulationTotalIterator.class);
			pageContext.getOut().print(theeconomic_region.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

