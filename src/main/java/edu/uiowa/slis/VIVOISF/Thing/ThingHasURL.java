package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasURLIterator theThingHasURLIterator = (ThingHasURLIterator)findAncestorWithClass(this, ThingHasURLIterator.class);
			pageContext.getOut().print(theThingHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

