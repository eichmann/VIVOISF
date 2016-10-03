package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentTranscriptOfIterator theAudioVisualDocumentTranscriptOfIterator = (AudioVisualDocumentTranscriptOfIterator)findAncestorWithClass(this, AudioVisualDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

