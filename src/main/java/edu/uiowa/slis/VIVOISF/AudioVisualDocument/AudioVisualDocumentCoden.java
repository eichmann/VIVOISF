package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodenIterator theAudioVisualDocument = (AudioVisualDocumentCodenIterator)findAncestorWithClass(this, AudioVisualDocumentCodenIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for coden tag ");
		}
		return SKIP_BODY;
	}
}

