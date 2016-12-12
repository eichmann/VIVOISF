package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPageEndIterator theThing = (ThingPageEndIterator)findAncestorWithClass(this, ThingPageEndIterator.class);
			pageContext.getOut().print(theThing.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

