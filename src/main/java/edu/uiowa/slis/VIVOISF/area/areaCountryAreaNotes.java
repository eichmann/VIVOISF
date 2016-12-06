package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(areaCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaCountryAreaNotesIterator thearea = (areaCountryAreaNotesIterator)findAncestorWithClass(this, areaCountryAreaNotesIterator.class);
			pageContext.getOut().print(thearea.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing area for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

