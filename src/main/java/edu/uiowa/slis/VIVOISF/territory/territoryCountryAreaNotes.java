package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryCountryAreaNotesIterator theterritory = (territoryCountryAreaNotesIterator)findAncestorWithClass(this, territoryCountryAreaNotesIterator.class);
			pageContext.getOut().print(theterritory.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

