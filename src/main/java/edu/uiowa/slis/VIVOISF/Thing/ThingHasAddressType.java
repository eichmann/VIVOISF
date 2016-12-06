package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasAddressIterator theThingHasAddressIterator = (ThingHasAddressIterator)findAncestorWithClass(this, ThingHasAddressIterator.class);
			pageContext.getOut().print(theThingHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

