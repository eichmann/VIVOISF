package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHasMinLatitudeIterator theThing = (ThingHasMinLatitudeIterator)findAncestorWithClass(this, ThingHasMinLatitudeIterator.class);
			pageContext.getOut().print(theThing.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

