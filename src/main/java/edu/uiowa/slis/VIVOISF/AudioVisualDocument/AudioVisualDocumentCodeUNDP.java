package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeUNDPIterator theAudioVisualDocument = (AudioVisualDocumentCodeUNDPIterator)findAncestorWithClass(this, AudioVisualDocumentCodeUNDPIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

