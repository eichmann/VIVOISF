package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCountryAreaNotesIterator theConferencePaper = (ConferencePaperCountryAreaNotesIterator)findAncestorWithClass(this, ConferencePaperCountryAreaNotesIterator.class);
			pageContext.getOut().print(theConferencePaper.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

