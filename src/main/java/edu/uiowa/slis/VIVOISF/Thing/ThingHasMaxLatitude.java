package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHasMaxLatitudeIterator theThing = (ThingHasMaxLatitudeIterator)findAncestorWithClass(this, ThingHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theThing.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

