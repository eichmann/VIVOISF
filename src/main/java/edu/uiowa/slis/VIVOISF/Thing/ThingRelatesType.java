package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRelatesIterator theThingRelatesIterator = (ThingRelatesIterator)findAncestorWithClass(this, ThingRelatesIterator.class);
			pageContext.getOut().print(theThingRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for relates tag ");
		}
		return SKIP_BODY;
	}
}

