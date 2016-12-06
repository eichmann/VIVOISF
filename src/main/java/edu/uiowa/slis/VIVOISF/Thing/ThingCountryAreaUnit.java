package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCountryAreaUnitIterator theThing = (ThingCountryAreaUnitIterator)findAncestorWithClass(this, ThingCountryAreaUnitIterator.class);
			pageContext.getOut().print(theThing.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

