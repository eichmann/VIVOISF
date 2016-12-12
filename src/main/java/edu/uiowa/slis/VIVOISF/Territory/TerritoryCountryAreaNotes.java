package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCountryAreaNotesIterator theTerritory = (TerritoryCountryAreaNotesIterator)findAncestorWithClass(this, TerritoryCountryAreaNotesIterator.class);
			pageContext.getOut().print(theTerritory.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

