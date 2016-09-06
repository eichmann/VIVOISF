package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentVolumeIterator theAudioDocument = (AudioDocumentVolumeIterator)findAncestorWithClass(this, AudioDocumentVolumeIterator.class);
			pageContext.getOut().print(theAudioDocument.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for volume tag ");
		}
		return SKIP_BODY;
	}
}

