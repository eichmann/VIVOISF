package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRO_0002234Iterator theThingRO_0002234Iterator = (ThingRO_0002234Iterator)findAncestorWithClass(this, ThingRO_0002234Iterator.class);
			pageContext.getOut().print(theThingRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

