package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingResearchAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingResearchAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingResearchAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingResearchAreaOfIterator theThingResearchAreaOfIterator = (ThingResearchAreaOfIterator)findAncestorWithClass(this, ThingResearchAreaOfIterator.class);
			pageContext.getOut().print(theThingResearchAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

