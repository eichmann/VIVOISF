package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingGDPNotesIterator theThing = (ThingGDPNotesIterator)findAncestorWithClass(this, ThingGDPNotesIterator.class);
			pageContext.getOut().print(theThing.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

