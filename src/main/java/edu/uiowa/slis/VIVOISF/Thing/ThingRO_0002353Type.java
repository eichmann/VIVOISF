package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRO_0002353Iterator theThingRO_0002353Iterator = (ThingRO_0002353Iterator)findAncestorWithClass(this, ThingRO_0002353Iterator.class);
			pageContext.getOut().print(theThingRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

