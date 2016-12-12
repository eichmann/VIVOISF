package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNumPagesIterator theThing = (ThingNumPagesIterator)findAncestorWithClass(this, ThingNumPagesIterator.class);
			pageContext.getOut().print(theThing.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for numPages tag ");
		}
		return SKIP_BODY;
	}
}

