package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasTitleIterator theThingHasTitleIterator = (ThingHasTitleIterator)findAncestorWithClass(this, ThingHasTitleIterator.class);
			pageContext.getOut().print(theThingHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

