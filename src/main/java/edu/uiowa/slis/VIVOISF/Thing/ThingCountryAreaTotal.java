package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCountryAreaTotalIterator theThing = (ThingCountryAreaTotalIterator)findAncestorWithClass(this, ThingCountryAreaTotalIterator.class);
			pageContext.getOut().print(theThing.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

