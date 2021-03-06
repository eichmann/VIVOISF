package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasGeoIterator theThingHasGeoIterator = (ThingHasGeoIterator)findAncestorWithClass(this, ThingHasGeoIterator.class);
			pageContext.getOut().print(theThingHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

