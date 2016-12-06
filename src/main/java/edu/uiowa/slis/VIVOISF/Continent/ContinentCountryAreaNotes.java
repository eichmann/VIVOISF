package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentCountryAreaNotesIterator theContinent = (ContinentCountryAreaNotesIterator)findAncestorWithClass(this, ContinentCountryAreaNotesIterator.class);
			pageContext.getOut().print(theContinent.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

