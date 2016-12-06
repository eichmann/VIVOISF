package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualPopulationNotesIterator theIndividual = (IndividualPopulationNotesIterator)findAncestorWithClass(this, IndividualPopulationNotesIterator.class);
			pageContext.getOut().print(theIndividual.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

