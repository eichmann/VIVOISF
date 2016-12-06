package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAgriculturalAreaNotesIterator theAudioVisualDocument = (AudioVisualDocumentAgriculturalAreaNotesIterator)findAncestorWithClass(this, AudioVisualDocumentAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

