package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingBFO_0000051Iterator theThingBFO_0000051Iterator = (ThingBFO_0000051Iterator)findAncestorWithClass(this, ThingBFO_0000051Iterator.class);
			pageContext.getOut().print(theThingBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

