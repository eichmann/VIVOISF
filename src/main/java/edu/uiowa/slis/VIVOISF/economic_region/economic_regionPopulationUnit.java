package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionPopulationUnitIterator theeconomic_region = (economic_regionPopulationUnitIterator)findAncestorWithClass(this, economic_regionPopulationUnitIterator.class);
			pageContext.getOut().print(theeconomic_region.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

