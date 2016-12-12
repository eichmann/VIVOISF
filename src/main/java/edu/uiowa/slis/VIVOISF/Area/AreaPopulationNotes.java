package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaPopulationNotesIterator theArea = (AreaPopulationNotesIterator)findAncestorWithClass(this, AreaPopulationNotesIterator.class);
			pageContext.getOut().print(theArea.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

