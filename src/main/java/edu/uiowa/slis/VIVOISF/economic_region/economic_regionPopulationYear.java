package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionPopulationYearIterator theeconomic_region = (economic_regionPopulationYearIterator)findAncestorWithClass(this, economic_regionPopulationYearIterator.class);
			pageContext.getOut().print(theeconomic_region.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

