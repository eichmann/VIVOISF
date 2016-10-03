package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentProducerIterator theAudioVisualDocumentProducerIterator = (AudioVisualDocumentProducerIterator)findAncestorWithClass(this, AudioVisualDocumentProducerIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for producer tag ");
		}
		return SKIP_BODY;
	}
}

