package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryLandAreaNotesIterator theCountry = (CountryLandAreaNotesIterator)findAncestorWithClass(this, CountryLandAreaNotesIterator.class);
			pageContext.getOut().print(theCountry.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

