package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCountryAreaNotesIterator theAudioVisualDocument = (AudioVisualDocumentCountryAreaNotesIterator)findAncestorWithClass(this, AudioVisualDocumentCountryAreaNotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

