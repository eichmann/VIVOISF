package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryPopulationNotesIterator theterritory = (territoryPopulationNotesIterator)findAncestorWithClass(this, territoryPopulationNotesIterator.class);
			pageContext.getOut().print(theterritory.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

