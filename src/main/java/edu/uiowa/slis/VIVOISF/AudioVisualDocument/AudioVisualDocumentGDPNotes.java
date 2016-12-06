package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGDPNotesIterator theAudioVisualDocument = (AudioVisualDocumentGDPNotesIterator)findAncestorWithClass(this, AudioVisualDocumentGDPNotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

