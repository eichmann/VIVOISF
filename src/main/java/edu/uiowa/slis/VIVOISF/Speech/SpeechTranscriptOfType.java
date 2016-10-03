package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechTranscriptOfIterator theSpeechTranscriptOfIterator = (SpeechTranscriptOfIterator)findAncestorWithClass(this, SpeechTranscriptOfIterator.class);
			pageContext.getOut().print(theSpeechTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

