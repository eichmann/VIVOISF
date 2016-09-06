package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryPopulationNotesIterator theCountry = (CountryPopulationNotesIterator)findAncestorWithClass(this, CountryPopulationNotesIterator.class);
			pageContext.getOut().print(theCountry.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

