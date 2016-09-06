package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentVolumeIterator theAudioVisualDocument = (AudioVisualDocumentVolumeIterator)findAncestorWithClass(this, AudioVisualDocumentVolumeIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}

