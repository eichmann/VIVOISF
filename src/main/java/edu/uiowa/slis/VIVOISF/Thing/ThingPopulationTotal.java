package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPopulationTotalIterator theThing = (ThingPopulationTotalIterator)findAncestorWithClass(this, ThingPopulationTotalIterator.class);
			pageContext.getOut().print(theThing.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

