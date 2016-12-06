package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLandAreaNotesIterator theAudioVisualDocument = (AudioVisualDocumentLandAreaNotesIterator)findAncestorWithClass(this, AudioVisualDocumentLandAreaNotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

