package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryPopulationNotesIterator theTerritory = (TerritoryPopulationNotesIterator)findAncestorWithClass(this, TerritoryPopulationNotesIterator.class);
			pageContext.getOut().print(theTerritory.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

