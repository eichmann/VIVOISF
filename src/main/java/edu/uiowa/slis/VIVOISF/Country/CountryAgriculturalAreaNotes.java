package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryAgriculturalAreaNotesIterator theCountry = (CountryAgriculturalAreaNotesIterator)findAncestorWithClass(this, CountryAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theCountry.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

