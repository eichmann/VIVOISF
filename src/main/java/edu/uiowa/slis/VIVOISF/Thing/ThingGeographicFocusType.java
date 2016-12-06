package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingGeographicFocusIterator theThingGeographicFocusIterator = (ThingGeographicFocusIterator)findAncestorWithClass(this, ThingGeographicFocusIterator.class);
			pageContext.getOut().print(theThingGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

