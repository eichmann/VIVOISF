package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRelatesIterator theThingRelatesIterator = (ThingRelatesIterator)findAncestorWithClass(this, ThingRelatesIterator.class);
			pageContext.getOut().print(theThingRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for relates tag ");
		}
		return SKIP_BODY;
	}
}

