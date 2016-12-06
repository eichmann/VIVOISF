package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008PopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008PopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008PopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008PopulationNotesIterator theBFO_0000008 = (BFO_0000008PopulationNotesIterator)findAncestorWithClass(this, BFO_0000008PopulationNotesIterator.class);
			pageContext.getOut().print(theBFO_0000008.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

