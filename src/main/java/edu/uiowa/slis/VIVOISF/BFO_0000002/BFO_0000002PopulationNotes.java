package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002PopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002PopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002PopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002PopulationNotesIterator theBFO_0000002 = (BFO_0000002PopulationNotesIterator)findAncestorWithClass(this, BFO_0000002PopulationNotesIterator.class);
			pageContext.getOut().print(theBFO_0000002.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

