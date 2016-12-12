package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaPopulationTotalIterator theArea = (AreaPopulationTotalIterator)findAncestorWithClass(this, AreaPopulationTotalIterator.class);
			pageContext.getOut().print(theArea.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

