package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCountryAreaYearIterator theThing = (ThingCountryAreaYearIterator)findAncestorWithClass(this, ThingCountryAreaYearIterator.class);
			pageContext.getOut().print(theThing.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

