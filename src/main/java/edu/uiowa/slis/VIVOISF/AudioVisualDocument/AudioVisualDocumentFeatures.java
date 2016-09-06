package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentFeaturesIterator theAudioVisualDocumentFeaturesIterator = (AudioVisualDocumentFeaturesIterator)findAncestorWithClass(this, AudioVisualDocumentFeaturesIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for features tag ");
		}
		return SKIP_BODY;
	}
}

