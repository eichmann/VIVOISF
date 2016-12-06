package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCountryAreaNotesIterator theStateOrProvince = (StateOrProvinceCountryAreaNotesIterator)findAncestorWithClass(this, StateOrProvinceCountryAreaNotesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

