package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentIdentifierIterator theAudioVisualDocument = (AudioVisualDocumentIdentifierIterator)findAncestorWithClass(this, AudioVisualDocumentIdentifierIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for identifier tag ");
		}
		return SKIP_BODY;
	}
}

