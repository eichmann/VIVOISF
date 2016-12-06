package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasMaxLatitudeIterator theAudioVisualDocument = (AudioVisualDocumentHasMaxLatitudeIterator)findAncestorWithClass(this, AudioVisualDocumentHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

