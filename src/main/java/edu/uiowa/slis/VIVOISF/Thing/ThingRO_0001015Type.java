package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRO_0001015Iterator theThingRO_0001015Iterator = (ThingRO_0001015Iterator)findAncestorWithClass(this, ThingRO_0001015Iterator.class);
			pageContext.getOut().print(theThingRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

