package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHasMaxLongitudeIterator theThing = (ThingHasMaxLongitudeIterator)findAncestorWithClass(this, ThingHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theThing.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

