package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasAddressIterator theThingHasAddressIterator = (ThingHasAddressIterator)findAncestorWithClass(this, ThingHasAddressIterator.class);
			pageContext.getOut().print(theThingHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

