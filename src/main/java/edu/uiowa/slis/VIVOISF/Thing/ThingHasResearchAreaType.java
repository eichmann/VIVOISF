package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasResearchAreaIterator theThingHasResearchAreaIterator = (ThingHasResearchAreaIterator)findAncestorWithClass(this, ThingHasResearchAreaIterator.class);
			pageContext.getOut().print(theThingHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

