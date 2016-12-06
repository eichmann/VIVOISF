package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingDescriptionIterator theThing = (ThingDescriptionIterator)findAncestorWithClass(this, ThingDescriptionIterator.class);
			pageContext.getOut().print(theThing.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for description tag ");
		}
		return SKIP_BODY;
	}
}

