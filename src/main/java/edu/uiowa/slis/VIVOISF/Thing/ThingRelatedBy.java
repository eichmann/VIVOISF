package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingRelatedByIterator theThingRelatedByIterator = (ThingRelatedByIterator)findAncestorWithClass(this, ThingRelatedByIterator.class);
			pageContext.getOut().print(theThingRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

