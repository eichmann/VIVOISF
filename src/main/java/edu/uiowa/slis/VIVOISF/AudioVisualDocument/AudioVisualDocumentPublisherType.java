package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentPublisherIterator theAudioVisualDocumentPublisherIterator = (AudioVisualDocumentPublisherIterator)findAncestorWithClass(this, AudioVisualDocumentPublisherIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for publisher tag ");
		}
		return SKIP_BODY;
	}
}

