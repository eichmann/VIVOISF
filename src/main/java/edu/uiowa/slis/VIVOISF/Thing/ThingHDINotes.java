package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHDINotesIterator theThing = (ThingHDINotesIterator)findAncestorWithClass(this, ThingHDINotesIterator.class);
			pageContext.getOut().print(theThing.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

