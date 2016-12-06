package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHasMinLongitudeIterator theThing = (ThingHasMinLongitudeIterator)findAncestorWithClass(this, ThingHasMinLongitudeIterator.class);
			pageContext.getOut().print(theThing.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

