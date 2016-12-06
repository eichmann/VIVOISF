package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015CountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015CountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015CountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015CountryAreaNotesIterator theBFO_0000015 = (BFO_0000015CountryAreaNotesIterator)findAncestorWithClass(this, BFO_0000015CountryAreaNotesIterator.class);
			pageContext.getOut().print(theBFO_0000015.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

