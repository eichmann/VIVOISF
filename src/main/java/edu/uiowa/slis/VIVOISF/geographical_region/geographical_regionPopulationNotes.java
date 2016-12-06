package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionPopulationNotesIterator thegeographical_region = (geographical_regionPopulationNotesIterator)findAncestorWithClass(this, geographical_regionPopulationNotesIterator.class);
			pageContext.getOut().print(thegeographical_region.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

