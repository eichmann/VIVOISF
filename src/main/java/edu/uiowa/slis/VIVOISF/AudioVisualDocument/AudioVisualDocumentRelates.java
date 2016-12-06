package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRelatesIterator theAudioVisualDocumentRelatesIterator = (AudioVisualDocumentRelatesIterator)findAncestorWithClass(this, AudioVisualDocumentRelatesIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for relates tag ");
		}
		return SKIP_BODY;
	}
}

