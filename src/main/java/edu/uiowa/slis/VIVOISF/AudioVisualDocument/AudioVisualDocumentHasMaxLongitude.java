package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasMaxLongitudeIterator theAudioVisualDocument = (AudioVisualDocumentHasMaxLongitudeIterator)findAncestorWithClass(this, AudioVisualDocumentHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

