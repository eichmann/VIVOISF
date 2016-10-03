package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAsinIterator theAudioVisualDocument = (AudioVisualDocumentAsinIterator)findAncestorWithClass(this, AudioVisualDocumentAsinIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for asin tag ");
		}
		return SKIP_BODY;
	}
}

