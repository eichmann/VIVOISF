package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentPopulationNotesIterator theContinent = (ContinentPopulationNotesIterator)findAncestorWithClass(this, ContinentPopulationNotesIterator.class);
			pageContext.getOut().print(theContinent.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

