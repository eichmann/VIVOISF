package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCountryAreaNotesIterator theeconomic_region = (economic_regionCountryAreaNotesIterator)findAncestorWithClass(this, economic_regionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

