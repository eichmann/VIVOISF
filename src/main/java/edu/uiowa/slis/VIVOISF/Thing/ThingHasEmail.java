package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasEmailIterator theThingHasEmailIterator = (ThingHasEmailIterator)findAncestorWithClass(this, ThingHasEmailIterator.class);
			pageContext.getOut().print(theThingHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

