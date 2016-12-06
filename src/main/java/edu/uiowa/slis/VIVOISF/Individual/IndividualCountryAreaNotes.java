package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualCountryAreaNotesIterator theIndividual = (IndividualCountryAreaNotesIterator)findAncestorWithClass(this, IndividualCountryAreaNotesIterator.class);
			pageContext.getOut().print(theIndividual.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

