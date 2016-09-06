package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentFeaturesIterator theAudioDocumentFeaturesIterator = (AudioDocumentFeaturesIterator)findAncestorWithClass(this, AudioDocumentFeaturesIterator.class);
			pageContext.getOut().print(theAudioDocumentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for features tag ");
		}
		return SKIP_BODY;
	}
}

