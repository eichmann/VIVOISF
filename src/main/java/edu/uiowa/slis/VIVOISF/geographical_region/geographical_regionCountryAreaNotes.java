package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCountryAreaNotesIterator thegeographical_region = (geographical_regionCountryAreaNotesIterator)findAncestorWithClass(this, geographical_regionCountryAreaNotesIterator.class);
			pageContext.getOut().print(thegeographical_region.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

