package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingBFO_0000050Iterator theThingBFO_0000050Iterator = (ThingBFO_0000050Iterator)findAncestorWithClass(this, ThingBFO_0000050Iterator.class);
			pageContext.getOut().print(theThingBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

