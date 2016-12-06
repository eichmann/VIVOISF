package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPopulationNotesIterator theConferencePoster = (ConferencePosterPopulationNotesIterator)findAncestorWithClass(this, ConferencePosterPopulationNotesIterator.class);
			pageContext.getOut().print(theConferencePoster.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

