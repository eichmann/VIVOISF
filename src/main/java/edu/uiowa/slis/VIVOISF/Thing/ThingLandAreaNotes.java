package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingLandAreaNotesIterator theThing = (ThingLandAreaNotesIterator)findAncestorWithClass(this, ThingLandAreaNotesIterator.class);
			pageContext.getOut().print(theThing.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

