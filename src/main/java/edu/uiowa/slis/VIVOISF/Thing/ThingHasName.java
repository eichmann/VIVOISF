package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasNameIterator theThingHasNameIterator = (ThingHasNameIterator)findAncestorWithClass(this, ThingHasNameIterator.class);
			pageContext.getOut().print(theThingHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasName tag ");
		}
		return SKIP_BODY;
	}
}

