package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCountryAreaNotesIterator theThing = (ThingCountryAreaNotesIterator)findAncestorWithClass(this, ThingCountryAreaNotesIterator.class);
			pageContext.getOut().print(theThing.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

