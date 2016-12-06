package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPopulationUnitIterator theThing = (ThingPopulationUnitIterator)findAncestorWithClass(this, ThingPopulationUnitIterator.class);
			pageContext.getOut().print(theThing.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

