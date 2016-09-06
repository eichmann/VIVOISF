package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentStatusIterator theAudioVisualDocumentStatusIterator = (AudioVisualDocumentStatusIterator)findAncestorWithClass(this, AudioVisualDocumentStatusIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for status tag ");
		}
		return SKIP_BODY;
	}
}

