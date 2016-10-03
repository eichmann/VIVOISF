package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentTranscriptOfIterator theAudioDocumentTranscriptOfIterator = (AudioDocumentTranscriptOfIterator)findAncestorWithClass(this, AudioDocumentTranscriptOfIterator.class);
			pageContext.getOut().print(theAudioDocumentTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

