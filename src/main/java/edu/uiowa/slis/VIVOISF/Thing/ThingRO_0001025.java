package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRO_0001025Iterator theThingRO_0001025Iterator = (ThingRO_0001025Iterator)findAncestorWithClass(this, ThingRO_0001025Iterator.class);
			pageContext.getOut().print(theThingRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

