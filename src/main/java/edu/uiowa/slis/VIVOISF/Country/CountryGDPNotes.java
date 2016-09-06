package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryGDPNotesIterator theCountry = (CountryGDPNotesIterator)findAncestorWithClass(this, CountryGDPNotesIterator.class);
			pageContext.getOut().print(theCountry.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

