package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPublisherIterator theThingPublisherIterator = (ThingPublisherIterator)findAncestorWithClass(this, ThingPublisherIterator.class);
			pageContext.getOut().print(theThingPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for publisher tag ");
		}
		return SKIP_BODY;
	}
}

