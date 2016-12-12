package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCountryAreaNotesIterator theArea = (AreaCountryAreaNotesIterator)findAncestorWithClass(this, AreaCountryAreaNotesIterator.class);
			pageContext.getOut().print(theArea.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

