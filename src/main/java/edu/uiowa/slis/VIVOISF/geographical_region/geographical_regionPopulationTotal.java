package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPopulationTotalIterator thegeographical_region = (geographical_regionPopulationTotalIterator)findAncestorWithClass(this, geographical_regionPopulationTotalIterator.class);
			pageContext.getOut().print(thegeographical_region.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

