package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPopulationYearIterator theThing = (ThingPopulationYearIterator)findAncestorWithClass(this, ThingPopulationYearIterator.class);
			pageContext.getOut().print(theThing.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

