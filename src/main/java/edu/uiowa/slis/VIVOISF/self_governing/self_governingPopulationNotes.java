package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingPopulationNotesIterator theself_governing = (self_governingPopulationNotesIterator)findAncestorWithClass(this, self_governingPopulationNotesIterator.class);
			pageContext.getOut().print(theself_governing.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

