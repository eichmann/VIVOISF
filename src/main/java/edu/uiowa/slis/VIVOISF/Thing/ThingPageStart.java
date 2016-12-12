package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPageStartIterator theThing = (ThingPageStartIterator)findAncestorWithClass(this, ThingPageStartIterator.class);
			pageContext.getOut().print(theThing.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

