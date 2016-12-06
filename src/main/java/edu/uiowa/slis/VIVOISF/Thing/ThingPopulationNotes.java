package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPopulationNotesIterator theThing = (ThingPopulationNotesIterator)findAncestorWithClass(this, ThingPopulationNotesIterator.class);
			pageContext.getOut().print(theThing.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

