package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCountryAreaNotesIterator theConferencePoster = (ConferencePosterCountryAreaNotesIterator)findAncestorWithClass(this, ConferencePosterCountryAreaNotesIterator.class);
			pageContext.getOut().print(theConferencePoster.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

