package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPagesIterator theAudioVisualDocument = (AudioVisualDocumentPagesIterator)findAncestorWithClass(this, AudioVisualDocumentPagesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for pages tag ");
		}
		return SKIP_BODY;
	}
}

